import Foundation

class SumLinkedList {
    class Node {
        var value: Int
        var next: Node?
        init(value: Int) {
            self.value = value
        }
    }

    func sumLinkedList(_ linkedListOne: Node, _ linkedListTwo: Node) -> Node? {
        var linkedListHead = Node(value: 0)
        var current = linkedListHead
        var carryOver = 0
        var headOne: Node? = linkedListOne
        var headTwo: Node? = linkedListTwo
        while headOne != nil || headTwo != nil || carryOver != 0 {
            var one = (headOne != nil) ? headOne!.value : 0
            var two = (headTwo != nil) ? headTwo!.value : 0
            var sum = one + two + carryOver;

            var newNode = Node(value: sum % 10)
            current.next = newNode
            current = newNode

            carryOver = sum / 10
            headOne = (headOne?.next != nil) ? headOne!.next : nil
            headTwo = (headTwo?.next != nil) ? headTwo!.next : nil
        }
        return linkedListHead.next!
    }
}