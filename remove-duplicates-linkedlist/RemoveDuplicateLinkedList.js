class LinkedList {
    constructor(value) {
      this.value = value;
      this.next = null;
    }
  }
  
  function removeDuplicatesFromLinkedList(linkedList) {
    let current = linkedList;
    while(current !== null) {
        let inner = current.next;
        while(inner !== null && current.value === inner.value) {
            inner = inner.next;
        }
        current.next = inner; 
        current = inner;
    }
    return linkedList;
  }
  
  // Do not edit the lines below.
  exports.LinkedList = LinkedList;
  exports.removeDuplicatesFromLinkedList = removeDuplicatesFromLinkedList;
  