public class ReverseLinkedList {
    static class LinkedList {
        public int value;
        public LinkedList next;
        public LinkedList(int value, LinkedList next) {
            this.value = value;
            this.next = next;
        }
    }

    public LinkedList ReverseLinkedLists(LinkedList head) {
        LinkedList current = head;
        LinkedList previous = null;
        while(current != null) {
            LinkedList next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;    
    }
}