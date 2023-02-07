import Foundation  

class LinkedListIntersect {
    class Node {
        var next: Node?
        var value: Int
        init(value: Int) {
            self.value = value
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