class Node {
    constructor(value) {
        this.value = value;
        this.next = next;
    }
}

// head => 0 -> 1 -> 2 -> 3 -> 4 -> 5
// k => 2
var linkedListShift = (head, k) => {
    let tail = head;
    let length = 1;
    while(tail.next != null) {
        length++;
        tail = tail.next;
    }

    let offset = Math.abs(k) % length;
    if(offset === 0) { return head; }
    let position = k > 0 ? length - offset : offset;
  
    let newTail = head;
    for(let i = 1; i < position; i++) {
        newTail = newTail.next;
    }
    let newHead = newTail.next;
    newTail.next = null; tail.next = head;
    return newHead;
}

exports.Node = Node;
exports.linkedListShift = linkedListShift;