using System.Collections.Generic;

public class LinkedListIntersect {
    public class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public Node LinkedListIntersects(Node linkedListOne, Node linkedListTwo) {
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
}