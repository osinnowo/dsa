import Foundation 

public class RotateLinkedList {
    class Node {
        var value: Int
        var next: Node?
        init(value: Int) {
            self.value = value
        }
    }

    func Node rotateLinkedList(_ head: Node?, _ k: Int) -> Node {
        var linkedListHead = head
        var index = 0
         while index <= k {
            var current: Node? = linkedListHead
            var tail: Node? = nil
            while(current != nil) {
                tail = current
                current = current!.next
            }
            var next = linkedListHead!.next; linkedListHead!.next = nil
            tail!.next = linkedListHead; linkedListHead = next!;
            index += 1
         }
         return linkedListHead!
    }
}