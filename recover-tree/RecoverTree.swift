class RecoverTree {
    func recoverTree(_ root: TreeNode?) {
        // Step 1: Traverse the tree in order and store the nodes in an array.
        var nodes = [TreeNode]()
        var inorderTraversal: ((TreeNode?) -> Void)!
        inorderTraversal = { node in
            guard let node = node else { return }
            inorderTraversal(node.left)
            nodes.append(node)
            inorderTraversal(node.right)
        }
        inorderTraversal(root)
        
        // Step 2: Find the two nodes that are in the wrong position.
        var firstNode: TreeNode?
        var secondNode: TreeNode?
        for i in 0..<nodes.count - 1 {
            if nodes[i].val > nodes[i+1].val {
                if firstNode == nil {
                    firstNode = nodes[i]
                }
                secondNode = nodes[i+1]
            }
        }
        
        // Step 3: Swap the values of the two nodes.
        if let firstNode = firstNode, let secondNode = secondNode {
            let temp = firstNode.val
            firstNode.val = secondNode.val
            secondNode.val = temp
        }
    }
}
