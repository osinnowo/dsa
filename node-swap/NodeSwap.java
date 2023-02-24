import java.util.*;

class Program {
  public static class Node {
    public int value;
    public Node next;

    public Node(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public Node nodeSwap(Node head) {
    Node temp = new Node(0);
    temp.next = head;
    Node prev = temp;
    while(prev.next != null && prev.next.next != null) {

        Node first = prev.next;
        Node second = prev.next.next;

      first.next = second.next;
      second.next = first;
      prev.next = second;

      prev = first;
    }
    return temp.next;
  }
}
