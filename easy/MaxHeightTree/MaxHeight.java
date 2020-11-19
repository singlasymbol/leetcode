//Problem Statement : https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int getHeight(TreeNode node) {
        if(node == null) {
            return 0;
        }
        
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
    
    public int maxDepth(TreeNode root) {
        return getHeight(root);   
    }
}