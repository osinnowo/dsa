class Node {
    constructor(value){
        this.value = value;
        this.next = null;
    }
}
exports.Node = Node;

var intersectLinkedList1 = (linkedListOne, linkedListTwo) => {
    let set = new Set();
    let currentLinkedListOne = linkedListOne;
    
    while(currentLinkedListOne != null) {
        set.add(currentLinkedListOne);
        currentLinkedListOne = currentLinkedListOne.next;
    }

    let currentLinkedListTwo = linkedListTwo;
    while(currentLinkedListTwo != null) {
        if(set.has(currentLinkedListTwo)) { return currentLinkedListTwo; }
        currentLinkedListTwo = currentLinkedListTwo.next
    }

    return null;
}   


var intersectLinkedList2 = (linkedListOne, linkedListTwo) => {
    const map = new Map();
    let head1 = linkedListOne;
    while(head1 !== null) {
        map.set(head1.value, head1);
        head1 = head1.next;
    }

    let head2 = linkedListTwo;
    while(head2 !== null) {
        if(map.has(head2.value)) { return head2 }
        head2 = head2.next;
    }
    return null;
}  

exports.intersectLinkedList = this.intersectLinkedList;