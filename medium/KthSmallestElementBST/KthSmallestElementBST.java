// PS: https://leetcode.com/problems/kth-smallest-element-in-a-bst/

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
    
    void inOrder(TreeNode node, int k, ArrayList<Integer> arr) {
        if(node == null) {
            return;
        }
        
        inOrder(node.left, k, arr);
        arr.add(node.val);
        inOrder(node.right, k, arr);
        
    }
    
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        inOrder(root, k, arr);
        return arr.get(k - 1);
    }
}