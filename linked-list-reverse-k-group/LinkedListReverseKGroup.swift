class LinkedListReverseKGroup {
    func reverseKGroup(_ head: ListNode?, _ k: Int) -> ListNode? {
    var currentNode = head
    var count = 0
    
    // Count the number of nodes in the linked list
    while currentNode != nil && count < k {
        currentNode = currentNode?.next
        count += 1
    }
    
    // If there are not enough nodes to reverse, return head
    if count < k {
        return head
    }
    
    // Reverse the first k nodes of the linked list
    var prev: ListNode? = nil
    var next: ListNode? = nil
    var current = head
    
    for _ in 0..<k {
        next = current?.next
        current?.next = prev
        prev = current
        current = next
    }
    
    // Recursively reverse the remaining linked list
    head?.next = reverseKGroup(current, k)
    
    return prev
}

}