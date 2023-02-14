using System.Collections.Generic;

public class LinkedListIntersect {
    public class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public Node LinkedListIntersect1(Node linkedListOne, Node linkedListTwo) {
        HashSet<Node> set = new HashSet<Node>();
        Node currentLinkedListOne = linkedListOne;
        while(currentLinkedListOne != null) {
            set.Add(currentLinkedListOne);
            currentLinkedListOne = currentLinkedListOne.next;
        }

        Node currentLinkedListTwo = linkedListTwo;
        while(currentLinkedListTwo != null) {
            if(set.Contains(currentLinkedListTwo)) { return currentLinkedListTwo; }
            currentLinkedListTwo = currentLinkedListTwo.next;
        }

        return null;
    }

    public Node LinkedListIntersect2(Node linkedListOne, Node linkedListTwo) {
        Dictionary<int, Node> dictionary = new Dictionary<int, Node>();
        Node head1 = linkedListOne;
        while(head1 != null) {
            dictionary.Add(head1.value, head1);
            head1 = head1.next;
        }

        Node head2 = linkedListTwo;
        while(head2 != null) {
            if(dictionary.ContainsKey(head2.value)) { return head2; }
            head2 = head2.next;
        }

        return null;
    }
}