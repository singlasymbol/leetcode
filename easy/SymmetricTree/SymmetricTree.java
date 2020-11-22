// PS : https://leetcode.com/problems/symmetric-tree/submissions/
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
    
    public boolean isSymmetricNode(TreeNode leftNode, TreeNode rightNode) {
        if(leftNode == null && rightNode == null) {
            return true;
        }
        
        if(leftNode == null) {
            return false;
        }
        
        if(rightNode == null) {
            return false;
        }
        
        boolean res = isSymmetricNode(leftNode.left, rightNode.right) && isSymmetricNode(leftNode.right, rightNode.left) ;

        return res && (leftNode.val == rightNode.val);
    }
    
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        
        return isSymmetricNode(root.left, root.right);
    }
}