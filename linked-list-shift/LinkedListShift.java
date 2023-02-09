import java.util.*;

class LinkedListShift {
  public static Node shiftLinkedList(Node head, int k) {
    Node tail = head;
    int length = 1;
    while(tail.next != null) {
        length += 1;
        tail = tail.next;
    }

    int offset = Math.abs(k) % length;
    if(offset == 0) return head;
    
    int position = k > 0 ? length - offset : offset;
    Node newTail = head;
    
    for(int i = 1; i < position; i++) {
        newTail = newTail.next;
    }

    Node newHead = newTail.next;
    newTail.next = null;
    tail.next = head;
    return newHead;
  }

  static class Node {
    public int value;
    public Node next;

    public Node(int value) {
      this.value = value;
      next = null;
    }
  }
}
