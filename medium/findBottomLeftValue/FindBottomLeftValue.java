// PS : https://leetcode.com/problems/find-bottom-left-tree-value/
// 513. Find Bottom Left Tree Value

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
    int maxLeftDistance = Integer.MAX_VALUE; // lefts
    int maxHeight = 0;
    
    public int findBottomLeftValue(TreeNode root) {
        findValue(root, 1, 0);
        return res;
    }
    
    public void findValue(TreeNode node, int height, int horizontalDistance) {
        if(node == null) {
            return;
        }
    

        if(height > maxHeight) {
            maxHeight = height;
            maxLeftDistance = Integer.MAX_VALUE; // reset the horizontal distance when we go lower.
            if(horizontalDistance <= maxLeftDistance) {
                maxLeftDistance = horizontalDistance;
                res = node.val;
            }  
        }
        
        findValue(node.left, height + 1, horizontalDistance - 1);
        findValue(node.right, height + 1, horizontalDistance + 1);
        
        return;
    }
    
}
