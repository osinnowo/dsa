class BinaryTreeSameTree {
    //Using Depth-First-Search
    func isSameTree(_ p: TreeNode?, _ q: TreeNode?) -> Bool {
        return isSameTreeRecursive(p, q)
    }

    func isSameTreeRecursive(_ p: TreeNode?, _ q: TreeNode?) -> Bool {
        if p == nil || q == nil {
            return p == nil && q == nil
        }
        
        if p?.val != q?.val {
            return false
        }
        
        return isSameTreeRecursive(p?.left, q?.left) && isSameTreeRecursive(p?.right, q?.right)
    }
}