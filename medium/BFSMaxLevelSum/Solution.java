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
    
    public void getMaxSum(TreeNode node, ArrayList<Integer> res, int height) {
        if(node == null) {
            return;
        }
        
        if(res.size() - 1 < height) {
            res.add(node.val);
        } else {
            res.set(height, res.get(height) + node.val);
        }
        
        getMaxSum(node.left, res, height + 1);
        getMaxSum(node.right, res, height + 1);
    }
    
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        getMaxSum(root, res, 0);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < res.size(); i++) {
            max = Math.max(max, res.get(i));
        }
        
        for(int i = 0; i < res.size(); i++) {
            if(max == res.get(i)) {
                return i + 1;
            }
        }
        
        return -1;
    }
}