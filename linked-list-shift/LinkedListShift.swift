class LinkedListShift {
    class Node {
        var value: Int
        var next: Node?
        init(value: Int){
            self.value = value
        }
    }

    func linkedListShift(_ head: Node, _ k: Int) -> Node {
        var tail: Node? = head
        var length = 1
        while tail!.next != nil {
            tail = tail!.next
            length += 1
        }

        var offset = abs(k) % length
        if(offset == 0) { return head }
        var position = (k > 0) ? length - offset : offset;

        var newTail: Node? = head
        for _ in stride(from: 1, to: position, by: 1) {
            newTail = newTail!.next
        }

        let newHead = newTail!.next
        newTail!.next = nil
        tail!.next = head
        
        return newHead
    }
}