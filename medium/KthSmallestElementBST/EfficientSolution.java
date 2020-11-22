// PS: https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/

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
    
    void inOrder(TreeNode node, int k, int []ans) {
        if(ans[0] == k || node == null) {
            return;
        }        

        inOrder(node.left, k, ans);
        
        ans[0] += 1;
        if(ans[0] == k) {
            ans[1] = node.val;
            return;
        }
        
        inOrder(node.right, k, ans);
        
    }
    
    public int kthSmallest(TreeNode root, int k) {
        int [] ans = new int[2];
        ans[0] = 0;
        ans[1] = -1;
        inOrder(root, k, ans);
        return ans[1];
    }
}