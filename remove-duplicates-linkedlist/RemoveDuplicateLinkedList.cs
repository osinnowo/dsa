using System.Collections.Generic;
using System;


public class RemoveDuplicateLinkedList {
	public class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}
	}

    // 1 -> 1 -> 1 -> 4 -> 4 -> 4 -> 5 -> 6 -> 6 -> null
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