public class SumLinkedList {
    static class Node {
        public Node next;
        public int value;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node sumLinkedList(Node linkedListOne, Node linkedListTwo) {
        Node linkedListHead = new Node(0);
        Node current = linkedListHead;
        int carryOver = 0;
        while(linkedListOne != null || linkedListTwo != null || carryOver != 0) {
            int one = (linkedListOne != null) ? linkedListOne.value : 0;
            int two = (linkedListTwo != null) ? linkedListTwo.value : 0;
            int sum = one + two + carryOver;

            Node node = new Node(sum % 10);
            current.next = node;
            current = node;

            carryOver = sum / 10;

            linkedListOne = (linkedListOne != null) ? linkedListOne.next : null;
            linkedListTwo = (linkedListTwo != null) ? linkedListTwo.next : null;
        }
        return linkedListHead.next;
    }
}
