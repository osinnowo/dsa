import java.util.*;

public class LinkedListIntersect {
    static class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    public Node linkedListIntersect1(Node linkedListOne, Node linkedListTwo) {
        Set<Node> linkedListNodes = new HashSet<>();
        Node currentLinkedListOne = linkedListOne;

        while(currentLinkedListOne != null) {
          linkedListNodes.add(currentLinkedListOne);
          currentLinkedListOne = currentLinkedListOne.next;
        }
    
        Node currentLinkedListTwo = linkedListTwo;
        while(currentLinkedListTwo != null){
          if(linkedListNodes.contains(currentLinkedListTwo)) return currentLinkedListTwo;
          currentLinkedListTwo = currentLinkedListTwo.next;
        }
        
        return null;
    }

    public Node linkedListIntersect2(Node linkedListOne, Node linkedListTwo) {
        Node head1 = linkedListOne;
        Map<Integer, Node> map = new HashMap<>();

        while(head1 != null) {
          map.put(head1.value, head1);
          head1 = head1.next;
        }

        Node head2 = linkedListTwo;
        while(head2 != null) {
          if(map.containsKey(head2.value)) return head2;
          head2 = head2.next;
        }
        
        return null;
    }
}
