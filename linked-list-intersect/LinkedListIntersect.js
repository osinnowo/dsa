class Node {
    constructor(value){
        this.value = value;
        this.next = null;
    }
}
exports.Node = Node;

var intersectLinkedList = (linkedListOne, linkedListTwo) => {
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

exports.intersectLinkedList = this.intersectLinkedList;