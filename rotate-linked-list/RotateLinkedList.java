public class RotateLinkedList {
    static class Node {
        public int value;
        public Node next;
        public Node(int value) { this.value = value; next = null; }
    }

    public Node RotateLinkedLists(Node head, int k) {
        int index = 0;
        while(index <= k) {
            Node current = head;
            Node tail = null;
            while(current != null) {
                tail = current;
                current = current.next;
            }
            Node next = head.next; head.next = null;
            tail.next = head; head = next;
            index++;
        }
        return head;
    }
}