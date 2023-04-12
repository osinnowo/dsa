/**
 * MIT License
 *
 * Copyright (c) 2023 Osinnowo Emmanuel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of 
 * this software and associated documentation files (the "Software"), to deal in 
 * the Software without restriction, including without limitation the rights to 
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies 
 * of the Software, and to permit persons to whom the Software is furnished to do 
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.                                
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS 
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER 
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN 
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.      
 *
 *   
 * ============================ 
 * Description:
 * ============================
 * 235. Lowest Common Ancestor of a Binary Search Tree:

 * Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given 
 * nodes in the BST. According to the definition of LCA on Wikipedia: “The lowest common ancestor 
 * is defined between two nodes p and q as the lowest node in T that has both p and q as descendants 
 * (where we allow a node to be a descendant of itself).”

 *  Example I:
 *
 *                     6
 *                   /   \
 *                  2     8
 *                 / \   / \
 *                0   4 7   9 
 *                   / \
 *                  3   5
 *   
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 * Explanation: The LCA of nodes 2 and 8 is 6. 
 *
 *
 *  Example II:
 *
 *                     6
 *                   /   \
 *                  2     8
 *                 / \   / \
 *                0   4 7   9 
 *                   / \
 *                  3   5
 *   
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
 * Output: 2
 * Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition. 
 * Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/?envType=study-plan&id=level-1
**/ 

public class LowestCommonAncestor {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    } 

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;
        while(current != null) {
            if(p.val > current.val && q.val > current.val) {
                current = current.right;
            } else if (p.val < current.val && q.val < current.val) {
                current = current.left;
            } else {
              break;
            }
        }
        return current;
    }
}