class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
      }
}
var sumLinkedList = (linkedListOne, linkedListTwo) => {
    let linkedListHead = new Node(0);
    let current = linkedListHead;
    let carryOver = 0;
    while(linkedListOne != null || linkedListTwo != null || carryOver != 0) {
        let one = (linkedListOne != null) ? linkedListOne.value : 0;
        let two = (linkedListTwo != null) ? linkedListTwo.value : 0;
        let sum = one + two + carryOver;

        let newNode = new Node(sum % 10);
        current.next = newNode;
        current = newNode;

        carryOver = Math.floor(sum / 10);

        linkedListOne = (linkedListOne != null) ? linkedListOne.next : null;
        linkedListTwo = (linkedListTwo != null) ? linkedListTwo.next : null;
    }
    return linkedListHead.next;
}

exports.Node = Node;
exports.sumLinkedList = sumLinkedList;