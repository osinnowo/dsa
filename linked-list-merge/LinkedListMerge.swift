class LinkedListMerge {
    class Node {
        var next: Node?
        var value: Int
        init(value: Int){ self.value = value }
    }

    func linkedListMerge(_ headOne: Node, _ headTwo: Node) -> Node {
        var current: Node = LinkedList(value: 0)
        var result: Node? = current
        var head1: Node? = headOne
        var head2: Node? = headTwo
        
        while head1 != nil, head2 != nil {
            if head2!.value < head1!.value {
                result!.next = head2
                head2 = head2!.next
                result = result!.next
            } else {
                result!.next = head1
                head1 = head1!.next
                result = result!.next
            }
        }
        if(head1 != nil) { result!.next = head1 }
        if(head2 != nil) { result!.next = head2 }
        return current.next!
    }
}