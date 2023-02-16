class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

var midLinkedListElement = (head) => {
    var slow = head;
    var fast = head;
    while(fast !== null && fast.next !== null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

exports.Node = Node;
exports.midLinkedListElement = midLinkedListElement;