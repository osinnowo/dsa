from typing import Optional

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class SymmetricTree:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        return self.search(root.left, root.right)

    def search(self, left: Optional[TreeNode], right: Optional[TreeNode]) -> bool:
        if left is None and right is None:
            return True

        if left is None or right is None:
            return False

        if left.val != right.val:
            return False

        return self.search(left.left, right.right) and self.search(left.right, right.left)    