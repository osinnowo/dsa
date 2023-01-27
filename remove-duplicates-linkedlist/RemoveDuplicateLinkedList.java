import java.util.*;

public class RemoveDuplicateLinkedList {
    public static class Node {
        public Node next;
        public int value;
        public Node(int value) {
            this.next = null;
            this.value = value;
        }
    }

    public Node RemoveDuplicatesFromLinkedList(Node linkedList) {
        Node current = linkedList;
        while(current != null) {
            Node inner = current.next;
            while(inner != null && current.value == inner.value) {
                inner = inner.next;
            }
            current.next = inner;
            current = inner;
        }
        return linkedList;
     }
}
