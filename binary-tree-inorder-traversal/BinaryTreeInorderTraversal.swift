/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public var val: Int
 *     public var left: TreeNode?
 *     public var right: TreeNode?
 *     public init() { self.val = 0; self.left = nil; self.right = nil; }
 *     public init(_ val: Int) { self.val = val; self.left = nil; self.right = nil; }
 *     public init(_ val: Int, _ left: TreeNode?, _ right: TreeNode?) {
 *         self.val = val
 *         self.left = left
 *         self.right = right
 *     }
 * }
 */
class BinaryTreeInorderTraversal {
    func inorderTraversal(_ root: TreeNode?) -> [Int] {
        var result: [Int] = []
        inorderTraversalRecursive(root, &result)
        return result
    }

    func inorderTraversalRecursive(_ node: TreeNode?, _ result: inout [Int]) {
        guard let node = node else { return }
        if node.left == nil, node.right == nil {
            result.append(node.val)
            return
        }

        inorderTraversalRecursive(node.left, &result)
        result.append(node.val)
        inorderTraversalRecursive(node.right, &result)
    }
}