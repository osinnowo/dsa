class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
        this.seen = false;
    }
}

exports.Node = Node;

var linkedListFindLoop = (head) => {
    var current = head;
    while(current != null && !current.seen) {
        current.seen = true;
        current = current.next;
    }

    return current;
}

exports.linkedListFindLoop = linkedListFindLoop;