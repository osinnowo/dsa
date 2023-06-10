from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right



class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0
        
        if root.left is None and root.right is None:
            return 1
        
        # Calculate the minimum depth recursively for the left and right subtrees
        min_left = float('inf') if root.left is None else self.minDepth(root.left)
        min_right = float('inf') if root.right is None else self.minDepth(root.right)
        
        return 1 + min(min_left, min_right)