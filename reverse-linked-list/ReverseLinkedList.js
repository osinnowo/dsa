const reverseLinkedList = (current) => {
    var previous = null
    while(current !== null) {
        const next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
    return previous;
}

exports.reverseLinkedList = reverseLinkedList;