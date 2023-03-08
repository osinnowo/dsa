class LinkedListPalindrome {
    class Node {
        var value: Int
        var next: Node?
        init(_ value: Int) {
            self.value = value
            self.next = nil
        }
    }
    // a -> b -> c -> d -> c -> b -> a -> nil
    //                d -> c -> b -> a
    func isPalindrome(_ head: Node?) -> Bool {
        var slow = head
        var fast = head
        while fast != nil, fast?.next != nil {
            slow = slow?.next
            fast = fast?.next?.next
        }

        var reverse = reverseList(slow)
        var secondHalf = head

        while secondHalf != nil, reverse != nil{
            if(secondHalf?.value != reverse?.value) { return false }
            secondHalf = secondHalf?.next
            reverse = reverse?.next
        }
        return true
    }

    func reverseList(_ head: Node?) -> Node? {
        var current = head 
        var previous: Node? = nil
        while(current != nil) {
            var next = current?.next
            current?.next = previous
            previous = current
            current = next
        }
        return previous
    }
}