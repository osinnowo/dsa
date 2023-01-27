// This is an input class. Do not edit.
class Node {
    constructor(value) {
        this.value = value;
        this.prev = null;
        this.next = null;
      }
    }
    
    // Feel free to add new properties and methods to the class.
    class LinkedListConstruction {
      constructor() {
        this.head = null;
        this.tail = null;
      }
    
      setHead(node) {
          if(this.head === null) {
              this.head = node;
              this.tail = node;
              return;
          }
          this.insertBefore(this.head, node);
      }
    
      setTail(node) {
          if(this.tail === null) {
              this.setHead(node);
              return;
          }
          this.insertAfter(this.tail, node);
      }
    
      insertBefore(node, nodeToInsert) {
          if(nodeToInsert === this.head && nodeToInsert === this.tail) { return ; }
          this.remove(nodeToInsert);
          nodeToInsert.next = node;
          nodeToInsert.prev = node.prev;
          if(node.prev === null) {
              this.head = nodeToInsert;
          } else {
              node.prev.next = nodeToInsert;
          }
          node.prev = nodeToInsert;
      }
    
      insertAfter(node, nodeToInsert) {
          if(nodeToInsert === this.head && nodeToInsert === this.tail) { return ; }
          this.remove(nodeToInsert);
          nodeToInsert.prev = node;
          nodeToInsert.next = node.next;
          if(node.next === null) {
              this.tail = nodeToInsert;
          } else {
              node.next.prev = nodeToInsert;
          }
          node.next = nodeToInsert;
      }
    
      insertAtPosition(position, nodeToInsert) {
          if(position === 1) { this.setHead(nodeToInsert); return ; }
          let currentPosition = 1;
          let current = this.head;
          while(current !== null && currentPosition++ !== position) {
              current = current.next;
          }
          if(current != null) {
              this.insertBefore(current, nodeToInsert);
          } else {
              this.setTail(nodeToInsert);
          }
      }
    
      removeNodesWithValue(value) {
        let current = this.head;
        while(current !== null) {
          let nodeToRemove = current;
          current = current.next;
          if(nodeToRemove.value == value) {
              this.remove(nodeToRemove);
          }
        }
      }
    
      remove(node) {
          if(node === this.head) { this.head = this.head.next; }
          if(node === this.tail) { this.tail = this.tail.prev; }
          this.removeNodeBindings(node);
      }
  
      removeNodeBindings(node) {
          if(node.prev !== null) { node.prev.next = node.next; }
          if(node.next !== null) { node.next.prev = node.prev; }
      }
    
      containsNodeWithValue(value) {
        let current = this.head;
        while(current !== null && current.value !== value) {
          current = current.next;
        }
        return current !== null;
      }
  }
  
  // Do not edit the lines below.
  exports.Node = Node;
  exports.LinkedListConstruction = LinkedListConstruction;
  