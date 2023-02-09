public class LinkedListShift {
    class Node {
        public int value;
        public Node next;
        public Node (int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node LinkedListShifts(Node head, int k) {
        Node tail = head;
        int length = 1;
        while(tail.next != null) {
            length++; tail = tail.next;
        }

        int offset = Math.Abs(k) % length;
        if(offset == 0) return head;
        int position = k > 0 ? length - offset : offset;

        Node newTail = head;
        for(int i = 1; i < position; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null; tail.next = head;
        return newHead;
    }
}