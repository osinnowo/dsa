import Foundation

public class RemoveDuplicateLinkedList {
    class Node {
        public var next: Node?
        public var value: Int
        public init(value: Int) {
            self.value = value
            self.next = nil
        }
    }

    func removeDuplcatesLinkedList(_ linkedList: Node) -> Node {
        var current: Node? = linkedList
        while current != nil {
            var inner = current!.next
            while inner != nil, current!.value == inner!.value {
                inner = inner!.next
            }
            current!.next = inner
            current = inner
        }
        return linkedList
    }
}