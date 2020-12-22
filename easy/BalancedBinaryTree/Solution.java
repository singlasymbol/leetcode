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
    boolean result;
    
    int compare(TreeNode node) {
        if(node == null || result == false) {
            return 0;
        }
        
        int leftHeight = compare(node.left);
        int rightHeight = compare(node.right);
        
        if(Math.abs(leftHeight - rightHeight) > 1) {
            result = false;
            return 0;
        }
        
        return 1 + Math.max(leftHeight, rightHeight);
    }
    
    public boolean isBalanced(TreeNode root) {
        result = true;
        compare(root);
        return result;
    }
}