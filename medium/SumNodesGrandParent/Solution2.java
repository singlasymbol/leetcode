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
    
    public void findSum(TreeNode node, TreeNode parent, TreeNode grandParent) {
        if(node == null) {
            return;
        }
        
        if(grandParent != null && grandParent.val % 2 == 0) {
            result = result+ node.val;
        }
        
        findSum(node.left, node, parent);
        findSum(node.right, node, parent);
        return;
    }
    
    public int sumEvenGrandparent(TreeNode root) {
        result = 0;
        findSum(root, null, null);
        return result;
    }
}