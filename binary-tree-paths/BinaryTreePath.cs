public class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      public TreeNode(int val = 0, TreeNode left = null, TreeNode right = null) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class BinaryTreePaths {
    public IList<string> BinaryTreePaths(TreeNode root) {
        List<string> path = new List<string>();
        if(root != null) {
            TraverseNode(root, path, "");
        }
        return path;
    }

    public void TraverseNode(TreeNode node, List<string> result, string path) {
        if(node.left == null && node.right == null) {
            result.Add(path + node.val);
            return;
        }

        if(node.left != null) {
            TraverseNode(node.left, result, path + node.val + "->");
        }

        if(node.right != null) {
            TraverseNode(node.right, result, path + node.val + "->");
        }
    }
}