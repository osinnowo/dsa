class Node {
    constructor(value){
        this.value = value;
        this.next = null;
    }
}

var linkedListMerge = (linkedListOne, linkedListTwo) => {
    var head = new Node(0);
    var current = head;
    while(linkedListOne !== null && linkedListTwo !== null) {
        if(linkedListOne.value < linkedListTwo.value) {
            current.next = linkedListOne;
            linkedListOne = linkedListOne.next;
            current = current.next;
        } else {
            current.next = linkedListTwo;
            linkedListTwo = linkedListTwo.next;
            current = current.next;
        }
    }

    if(linkedListOne !== null) {
        current.next = linkedListOne;
    }

    if(linkedListTwo !== null) {
        current.next = linkedListTwo;
    }

    return head.next;
}

exports.Node = Node;
exports.linkedListMerge = linkedListMerge;