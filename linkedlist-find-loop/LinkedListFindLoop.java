public class LinkedListFindLoop {
    static class Node {
        public Node next;
        public int value;
        public boolean seen = false;
        public Node(int value) {
            this.value = value;
        }
    }

    public Node findLoopLinkedList(Node head) {
        Node current = head;
        while (current != null && !current.seen ) {
            current.seen = true;
            current = current.next;
        }
        return current;
    }
}
