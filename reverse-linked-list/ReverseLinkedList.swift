class ReverseLinkedList {
    class LinkedList {
        var value: Int?
        var next: LinkedList?
    }

    func reverseLinkedList(head: LinkedList) -> LinkedList {
        var current = head
        var previous: LinkedList? = nil
        while(current != nil) {
            let next = current.next
            current.next = previous
            previous = current
            current = next
        }
        return previous
    }
}