// PS:https://leetcode.com/problems/binary-tree-level-order-traversal/
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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int nodesInQueue = 0;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            return res;
        }
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            nodesInQueue = queue.size();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            while(nodesInQueue > 0) {
                TreeNode node = queue.poll();

                if(node.left != null) {
                    queue.add(node.left);
                }
                
                if(node.right != null) {
                    queue.add(node.right);
                }
                
                arr.add(node.val);
                
                nodesInQueue--;
            }
            
            res.add(arr);
        }
        
        return res;
        
    }
}