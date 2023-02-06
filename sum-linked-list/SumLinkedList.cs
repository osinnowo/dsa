using System;

public class SumLinkedList {
    public class Node {
        public Node next;
        public int value;
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public Node SumLinkedLists(Node linkedListOne, Node linkedListTwo) {
        Node linkedListHead = new Node(0);
        Node current = linkedListHead;
        int carry = 0;
        while(linkedListOne != null || linkedListTwo != null || carry != 0) {
            int one = (linkedListOne != null) ? linkedListOne.value : 0 ;
            int two = (linkedListTwo != null) ? linkedListTwo.value : 0 ;
            int sum = one + two + carry;

            Node newNode = new Node(sum % 10);
            current.next = newNode;
            current = newNode;

            carry = sum / 10;

            linkedListOne = (linkedListOne != null) ? linkedListOne.next : null;
            linkedListTwo = (linkedListTwo != null) ? linkedListTwo.next : null;
        }
        return linkedListHead.next;
    }
}