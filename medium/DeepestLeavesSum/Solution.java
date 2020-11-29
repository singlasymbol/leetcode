// PS - https://leetcode.com/problems/deepest-leaves-sum/
// 1302. Deepest Leaves Sum

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
    int maxHeight = -1;
    int sum = 0;
    
    public int deepestLeavesSum(TreeNode root) {
        deepestSum(root, 0);
        return sum;    
    }
    
    
    public void deepestSum(TreeNode node, int height) {
        
        if(node == null) {
            return;
        }
                
        if(height == maxHeight) {
            sum += node.val;
        } else if(height > maxHeight) {
            sum = node.val;
            maxHeight = height;
        } else {
            // continue;
        }
        
        deepestSum(node.left, (height + 1));
        deepestSum(node.right, (height + 1));
        
        return;
    }
}