public class BinarySearchValidate {
    public bool IsValidBST(TreeNode root) {
        return IsValidBSTRecursive(root, long.MinValue, long.MaxValue);
    }

    public bool IsValidBSTRecursive(TreeNode node, long min, long max) {
        if(node == null) return true;
        if(min >= node.val || max <= node.val) { return false; }
        return IsValidBSTRecursive(node.left, min, node.val) && IsValidBSTRecursive(node.right, node.val, max);
    }   
}