import java.util.*;
class LinkedListLRUCache {
  static class LRUCache {
    Map<String, DoubleLinkedListNode> cache = new HashMap<>();
    DoubleLinkedList linkedListOfMostRecentUse = new DoubleLinkedList();
    int currentPosition = 0;
    int maxSize;

    public LRUCache(int maxSize) {
      this.maxSize = maxSize > 1 ? maxSize : 1;
    }

    public void evictLeaseRecentUse() {
      String keyToRemove = linkedListOfMostRecentUse.tail.key;
      linkedListOfMostRecentUse.removeTail();
      cache.remove(keyToRemove);
    }

    public void insertKeyValuePair(String key, int value) {
      if(!cache.containsKey(key)) {
        if(currentPosition == this.maxSize) {
          evictLeaseRecentUse();
        } else {
          currentPosition++;
        }
        cache.put(key, new DoubleLinkedListNode(key, value));
      } else {
        updateKey(key, value);
      }
      updateMostRecent(cache.get(key));
    }

    public void updateMostRecent(DoubleLinkedListNode node) {
      linkedListOfMostRecentUse.setHead(node);
    }

    public void updateKey(String key, int value) {
      if(!this.cache.containsKey(key)) { return; }
      cache.get(key).value = value;
    }

    public LRUResult getValueFromKey(String key) {
      if(!cache.containsKey(key)) {
        return new LRUResult(false, -1 );
      }
      updateMostRecent(cache.get(key));
      return new LRUResult(true, cache.get(key).value);
    }

    public String getMostRecentKey() {
      if(linkedListOfMostRecentUse.head == null) {
        return "";
      }
      return linkedListOfMostRecentUse.head.key;
    }
  }

  static class DoubleLinkedListNode {
    public String key;
    public int value;
    public DoubleLinkedListNode next;
    public DoubleLinkedListNode prev;
    public DoubleLinkedListNode(String key, int value) {
      this.key = key;
      this.value = value;
    }

    public void removeBindings() {
      if(prev != null) {
        prev.next = next;
      } 

      if(next != null) {
        next.prev = prev;
      }
      prev = null;
      next = null;
    }
  }

  static class DoubleLinkedList {
    public DoubleLinkedListNode head = null;
    public DoubleLinkedListNode tail = null;

    public void setHead(DoubleLinkedListNode node) {
      if(head == node) { return ; }
      
      if(head == null) {
        head = node;
        tail = node;
        return;
      }
      
      if(head == tail) {
        tail.prev = node;
        node.next = tail;
        head = node;
      } else {
        if(tail == node) {
          removeTail();
        }
        node.removeBindings();
        head.prev = node;
        node.next = head;
        head = node;
      }
    }

    public void removeTail() {
      if(tail == null) {
        return;
      }
      if(tail == head) {
        tail = null;
        head = null;
        return;
      }
      tail = tail.prev;
      tail.next = null;
    }
  }

  static class LRUResult {
    boolean found;
    int value;

    public LRUResult(boolean found, int value) {
      this.found = found;
      this.value = value;
    }
  }
}
