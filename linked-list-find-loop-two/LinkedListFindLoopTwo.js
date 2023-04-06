var linkedListFindLoopTwo = function(head) {
    let fast = head;
    let slow = head;
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
        if(fast === slow) {
            slow = head;
            while(fast !== slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
    }
    return null;
};

exports.linkedListFindLoopTwo = linkedListFindLoopTwo;