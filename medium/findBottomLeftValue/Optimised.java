// PS : https://leetcode.com/problems/find-bottom-left-tree-value/submissions/
// Since we are iterating left to right. so when we reach the most depth for the first time, it'll be the left most element for that depth

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
    int res = 0;
    int maxHeight = 0;
    
    public int findBottomLeftValue(TreeNode root) {
        findValue(root, 1);
        return res;
    }
    
    public void findValue(TreeNode node, int height) {
        if(node == null) {
            return;
        }
        if(height > maxHeight) {
            maxHeight = height;
            res = node.val;
        }
        
        findValue(node.left, height + 1);
        findValue(node.right, height + 1);
        
        return;
    }
    
}
