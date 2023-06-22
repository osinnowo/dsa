import math

class ClosestValue:
    def closestValue(self, root: Optional[TreeNode], target: float) -> int:
        closest = root.val  # Initialize closest with the root value
        
        def traverse(node):
            nonlocal closest
            
            if not node:
                return
            
            if abs(node.val - target) < abs(closest - target):
                closest = node.val  # Update closest if the current node is closer to the target
            
            if target < node.val:
                traverse(node.left)  # Recursively traverse the left subtree if the target is smaller
            else:
                traverse(node.right)  # Recursively traverse the right subtree if the target is larger
        
        traverse(root)  # Start the tree traversal
        
        return closest
