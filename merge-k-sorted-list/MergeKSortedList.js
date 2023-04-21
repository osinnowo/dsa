/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode[]} lists
 * @return {ListNode}
 */
var mergeKLists = function(lists) {
    if(lists.length === 0) { return null; }
    if(lists.length === 1) { return lists[0]; }

    let current = lists[0];
    for(let i = 1; i < lists.length; i++) {
        current = mergeList(current, lists[i]);
    }
    return current;
};

var mergeList = function(node1, node2) {
    let result = new ListNode(0);
    let current = result;
    let head1 = node1;
    let head2 = node2;

    while(head1 !== null && head2 !== null) {
        if(head1.val <= head2.val) {
            current.next = head1;
            current = head1;
            head1 = head1.next;
        } else {
            current.next = head2;
            current = head2;
            head2 = head2.next;
        }
    }

    if(head1 !== null) {
        current.next = head1;
    }

    if(head2 !== null) {
        current.next = head2;
    }

    return result.next;
};