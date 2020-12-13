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
    
    public void findSum(TreeNode node, int parentVal, int grandParentVal) {
        if(node == null) {
            return;
        }
        
        if(grandParentVal != -1 && grandParentVal % 2 == 0) {
            result = result+ node.val;
        }
        
        findSum(node.left, node.val, parentVal);
        findSum(node.right, node.val, parentVal);
        return;
    }
    
    public int sumEvenGrandparent(TreeNode root) {
        result = 0;
        findSum(root, -1, -1);
        return result;
    }
}