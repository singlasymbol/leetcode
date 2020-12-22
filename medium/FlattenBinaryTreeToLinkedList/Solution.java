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
    public void flatten(TreeNode root) {
        TreeNode rightestNode;
        
        while(root != null) {
            
            if(root.left != null) {
                rightestNode = getRightestNode(root.left);
                rightestNode.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            
            root = root.right;
        }
        
        return;
    }
    
    TreeNode getRightestNode(TreeNode node) {
        if(node == null) {
            return null;
        }
        
        while(node.right != null) {
            node = node.right;
        }
        
        return node;
    }
}