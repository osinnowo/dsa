import java.util.*;

public class LinkedListIntersect {
    static class Node {
        public int value;
        public Node next;
        public Node(int value) {
            this.value = value;
        }
    }
    public Node linkedListIntersect(Node linkedListOne, Node linkedListTwo) {
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
}
