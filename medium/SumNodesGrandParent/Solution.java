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
    
    int result;
    
    public void findSum(TreeNode node) {
        if(node == null) {
            return;
        }
        
        if((node.val % 2 == 0) && node.left != null) {
            if(node.left.left != null) {
                result = result + node.left.left.val;
            }
            
            if(node.left.right != null) {
                result = result + node.left.right.val;
            }
        }
            
        if((node.val % 2 == 0) && node.right != null) {
            if(node.right.right != null) {
                result = result + node.right.right.val;
            }
            if(node.right.left != null) {
                result = result + node.right.left.val;
            }
        }
        
        findSum(node.left);
        findSum(node.right);
        return;
    }
    
    public int sumEvenGrandparent(TreeNode root) {
        result = 0;
        findSum(root);
        return result;
    }
}