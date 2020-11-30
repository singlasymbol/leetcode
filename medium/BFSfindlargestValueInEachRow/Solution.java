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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int nodesInQueue = 1;
        
        while(queue.size() != 0) {
            nodesInQueue = queue.size();
            int max = Integer.MIN_VALUE;
            
            while(nodesInQueue-- > 0) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    queue.add(node.left);
                }
                
                if(node.right != null) {
                    queue.add(node.right);
                }
                
                max = Math.max(node.val, max);
            }
            
            res.add(max);
        }
        
        return res;
    }
}