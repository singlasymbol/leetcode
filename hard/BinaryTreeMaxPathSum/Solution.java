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
    int maxSum = Integer.MIN_VALUE;
    
    public int maxSum(TreeNode node) {
        if(node == null) {
            return 0;
        }    
        
        int leftSum = maxSum(node.left);
        int rightSum = maxSum(node.right);
        
        maxSum = Math.max(maxSum, Math.max(Math.max(Math.max(leftSum + node.val, rightSum + node.val), node.val), leftSum + rightSum + node.val));
        // System.out.println(" maxsum " + maxSum + " at node " + node.val);       
        return Math.max(Math.max(leftSum + node.val, rightSum + node.val), node.val);
    }
    
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return maxSum;
    }
}