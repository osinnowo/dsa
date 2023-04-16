public class LinkedListSwapPairs {
    public ListNode SwapPairs(ListNode head) {
        if(head != null && head.next == null) { return head; }
        ListNode current = new ListNode();
        ListNode result = current;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            ListNode previous = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(fast != null && fast.next != null) {
                ListNode next = fast.next;
                fast.next = next.next;
                next.next = fast;
                previous.next = next;
            } else {
                previous.next = fast;
            }
            slow.next = previous;
            current.next = slow; 
            current = fast;
            if(fast != null && fast.next != null) {
                fast = fast.next;
                slow = fast;
            }
        }
        return result.next;
    }
}