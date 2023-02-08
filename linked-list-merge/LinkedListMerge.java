import java.util.*;

class LinkedListMerge {
  public static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public static Node mergeLinkedLists(Node headOne, Node headTwo) {
    Node head = new Node(0);
    Node current = head;

    while(headOne != null && headTwo != null) {
        if(headOne.value < headTwo.value) {
            current.next = headOne;
            headOne = headOne.next;
            current = current.next;
        } else {
            current.next = headTwo;
            headTwo = headTwo.next;
            current = current.next;
        }
    }
    if(headOne != null) {
        current.next = headOne;
    }
    if(headTwo != null) {
        current.next = headTwo;
    }
    return head.next;
  }
}
