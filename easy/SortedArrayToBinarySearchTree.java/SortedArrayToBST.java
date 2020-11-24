// PS: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/submissions/
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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }
        
        return fillTree(0, nums.length - 1, nums);
    }
    
    TreeNode fillTree(int low, int high, int [] nums) {
        if(low > high) {
            return null;
        }
        
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = fillTree(low, mid - 1, nums);
        node.right = fillTree(mid + 1, high, nums);
        
        return node;
    }
}