// https://leetcode.com/problems/binary-tree-right-side-view/
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
    int maxHeight;
    
    // We have to get nodes that are at rightest on that particular height.
    // Start traversing from the right node first and then the left node.
    // Maintain max height visited and keep adding the first node.
    void getRightView(TreeNode node, int height, List<Integer> res) {
        if(node == null) {
            return;
        }
        
        if(height > maxHeight) {
            res.add(node.val);
            maxHeight = height;
        }
        
        getRightView(node.right, height + 1, res);
        getRightView(node.left, height + 1, res);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        
        if(root == null) { // edgecase.
            return res;
        }
        maxHeight = -1;
        
        getRightView(root, 0, res);
        return res;
    }
}