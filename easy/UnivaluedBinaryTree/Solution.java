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
    
    boolean isUnival(TreeNode root, int value) {
        if(root == null) {
            return true;
        }
        
        if(root.val != value) {
            return false;
        }
        
        return isUnival(root.left, value) && isUnival(root.right, value);
    }
    
    public boolean isUnivalTree(TreeNode root) {
        return isUnival(root, root.val);
    }
}