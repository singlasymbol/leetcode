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
    
    ArrayList<Integer> getLeaves(TreeNode node, ArrayList<Integer> arr) {
        if(node == null) {
            return arr;
        }
        
        getLeaves(node.left, arr);
        if(node.left == null && node.right == null) {
            arr.add(node.val);
        }
        return getLeaves(node.right, arr);
    }
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leftarr = new ArrayList<>();
        ArrayList<Integer> rightarr = new ArrayList<>();
        leftarr = getLeaves(root1, leftarr);
        rightarr = getLeaves(root2, rightarr);
        
        return leftarr.equals(rightarr);
    }
}