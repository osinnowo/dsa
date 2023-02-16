public class MidLinkedListElement {
    static class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public Node midLinkedListElement(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
