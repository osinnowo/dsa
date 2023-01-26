class LinkedListConstruction {
  class Node {
    var value: Int
    var previous: Node?
    var next: Node?

    init(value: Int) {
      self.value = value
      previous = nil
      next = nil
    }
  }

  class DoublyLinkedList {
    var head: Node?
    var tail: Node?

    init() {
      head = nil
      tail = nil
    }

    func containsNodeWithValue(value: Int) -> Bool {
      var node = head
      
      while node != nil, value != node?.value {
        node = node?.next
      } 
      
      return node != nil
    }

    func remove(node: Node) {
      if node === head {
        head = head?.next
      }
      if node === tail {
        tail = tail?.previous
      }
      removeNodeBindings(node: node)
    }

    func removeNodesWithValue(value: Int) {
      var node = head
      while(node != nil) {
         var nodeToRemove = node
         node = node?.next 
         if nodeToRemove?.value == value {
           remove(node: nodeToRemove!)
         }
      }
    }

    func insertBefore(node: Node, nodeToInsert: Node) {
      if nodeToInsert === head, nodeToInsert === tail {
        return
      }
      remove(node: nodeToInsert)
      nodeToInsert.next = node
      nodeToInsert.previous = node.previous
      if node.previous == nil {
        head = nodeToInsert
      } else {
        node.previous?.next = nodeToInsert
      }
      node.previous = nodeToInsert
    }

    func insertAfter(node: Node, nodeToInsert: Node) {
      if nodeToInsert === head, nodeToInsert === tail {
        return 
      }
      remove(node: nodeToInsert)
      nodeToInsert.previous = node
      nodeToInsert.next = node.next

      if node.next == nil {
        tail = nodeToInsert
      } else {
        node.next?.previous = nodeToInsert
      }
      node.next = nodeToInsert
    }

    func setHead(node: Node) {
      if head == nil {
        head = node
        tail = node
        return
      }
      insertBefore(node: head!, nodeToInsert: node)
    }

    func setTail(node: Node) {
      if tail == nil {
        setHead(node: node)
        return
      }
      insertAfter(node: tail!, nodeToInsert: node)
    }

    func insertAtPosition(position:  Int, nodeToInsert: Node) {
      if position == 1 { setHead(node: nodeToInsert); return }
      var node = head
      var currentPosition = 1
      while node !== nil && currentPosition != position {
        currentPosition += 1
        node = node?.next
      }

      if node !== nil {
        insertBefore(node: node!, nodeToInsert: nodeToInsert)
      } else {
        setTail(node: nodeToInsert)
      }
    }

    func removeNodeBindings(node: Node) {
      node.previous?.next = node.next
      node.next?.previous = node.previous
      node.next = nil
      node.previous = nil
    }
  }
}
