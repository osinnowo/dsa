public class LinkedListRemoveKthNodeFromEnd {
    static class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    
    public static void removeKthNodeFromEnd(Node head, int k) {
        Node tail = head;
        int index = 1;
        while(tail.next != null) {
            index += 1;
            tail = tail.next;
        }

        if(index == k) {
            head.value = head.next.value;
            head.next = head.next.next;
            return ;
        }

        if(k == 0) {
            tail = null; return;
        }
        
        Node current = head;
        while(current != null && --index > k) {
            current = current.next;
        }

        current.next = current.next.next;
    }
}
