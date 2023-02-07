import Foundation  

class LinkedListIntersect: Hashable {
    class Node {
        var next: Node?
        var value: Int
        init(value: Int) {
            self.value = value
        }

        func hash(into hasher: inout Hasher) {
            hasher.combine(ObjectIdentifier(self).hashValue)
        }

        static func == (left: LinkedList, right: LinkedList) -> Bool {
            return left === right
        }
    }
    func linkedListInstersect(_ linkedListOne: Node, _ linkedListTwo: Node) -> Node? {
        var set: Set<Node> = []
        var currentLinkedListOne: Node? = linkedListOne
        while currentLinkedListOne != nil {
            set.insert(currentLinkedListOne!)
            currentLinkedListOne = currentLinkedListOne!.next
        }

        var currentLinkedListTwo: Node? = linkedListTwo
        while currentLinkedListTwo != nil {
            if(set.contains(currentLinkedListTwo!)) { return currentLinkedListTwo }
            currentLinkedListTwo = currentLinkedListTwo!.next
        }

        return nil
    }
}