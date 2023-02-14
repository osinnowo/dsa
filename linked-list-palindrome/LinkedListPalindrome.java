import java.util.*;

class LinkedListPalindrome {
  public static class Node {
    public int value;
    public Node next;

    public Node(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public boolean LinkedListPalindrome(Node head) {
    Node slowNode = head;
    Node fastNode = head;
    while(fastNode != null && fastNode.next != null) {
      slowNode = slowNode.next;
      fastNode = fastNode.next.next;
    }

    Node reversedSecondHalfNode = reverseLinkedList(slowNode);
    Node firstHalfNode = head;
    while(reversedSecondHalfNode != null) {
      if(reversedSecondHalfNode.value  != firstHalfNode.value) return false;
      reversedSecondHalfNode = reversedSecondHalfNode.next;
      firstHalfNode = firstHalfNode.next;
    }

    return true;
  }

  public Node reverseLinkedList(Node head) {
    Node current = head;
    Node previous = null;
    while(current != null) {
      Node next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }
}
