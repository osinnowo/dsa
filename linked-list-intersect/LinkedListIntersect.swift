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
    func linkedListInstersect1(_ linkedListOne: Node, _ linkedListTwo: Node) -> Node? {
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

    func linkedListInstersect2(_ linkedListOne: Node, _ linkedListTwo: Node) -> Node? {
        var dictionary: [Int : Node] = [:]
        var head1: Node? = linkedListOne
        while(head1 != nil) {
            dictionary[head1!.value] = head1!
            head1 = head1!.next
        }

        var head2: Node? = linkedListTwo
        while(head2 != nil) {
            let isContained = dictionary.contains { $0.key == head2!.value }
            if(isContained) { return head2 }
            head2 = head2!.next
        }
      return nil
    }
}