class LinkeListFindLoop {
  class Node {
    var value: Int
    var next: Node?
    var seen: Bool = false

    init(value: Int) {
      self.value = value
      next = nil
    }
  }

  func findLoop(head: Node) -> Node? {
     var current: Node? = head
     while !current!.seen {
       current!.seen = true
       current = current!.next
     }
    return current
  }
}