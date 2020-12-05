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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) {
            return res;
        }
        
        Stack<List<Integer>> st = new Stack<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        int nodesInQueue = 1;
        q.add(root);
        
        while(!q.isEmpty()) {
            nodesInQueue = q.size();
            List<Integer> temp = new ArrayList<Integer>();
            
            while(nodesInQueue-- > 0) {
                TreeNode node = q.poll();
                
                if(node.left != null) {
                    q.add(node.left);
                }
                
                if(node.right != null) {
                    q.add(node.right);
                }
                temp.add(node.val);
            }
            
            st.push(temp);
        }
        
        while(st.size() != 0) {
            res.add(st.pop());
        }
        
        return res;
        
    }
}