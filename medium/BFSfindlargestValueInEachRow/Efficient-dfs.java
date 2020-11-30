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
    
    public void findLargest(TreeNode node, List<Integer>list, int height) {
        if(node == null) {
            return;
        }
        
        if(list.size() - 1 < height) {
            list.add(node.val);   
        } else {
            if(node.val > list.get(height)) {
                list.set(height, node.val);
            }
        }
        
        findLargest(node.left, list, height + 1);
        findLargest(node.right, list, height + 1);
        return;
    }
    
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        findLargest(root, res, 0);
        return res;
    }
}