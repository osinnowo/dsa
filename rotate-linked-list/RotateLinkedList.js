class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

var rotateLinkedList = (head, k) => {
    let index = 0;
    while(index <= k) {
        let current = head;
        let tail = null;
        while(current !== null) {
            tail = current;
            current = current.next;
        }
        let next = head.next; head.next = null;
        tail.next = head; head = next;
        index++;
    }
    return head;
}

exports.rotateLinkedList = rotateLinkedList;
exports.Node = Node;