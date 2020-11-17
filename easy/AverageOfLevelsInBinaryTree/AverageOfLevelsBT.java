// ProblemStatement : https://leetcode.com/problems/average-of-levels-in-binary-tree/
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        traverseTree(root, result);
        return result;
    }
    
    public void traverseTree(TreeNode ptr, List<Double> res) {
        if(ptr == null) {
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(ptr);        
        int level = 0;
        
        while(true) {
            int nodeCountInQueue = queue.size();
            int currentNodeCount = nodeCountInQueue;
            Double sum = new Double(0);
            if(nodeCountInQueue == 0) {
                break;
            }
            
            while(nodeCountInQueue != 0) {
                TreeNode polledNode = queue.poll();
                sum += new Double(polledNode.val);
                
                if(polledNode.right  != null) {
                    queue.add(polledNode.right);    
                }
                
                if(polledNode.left != null) {
                    queue.add(polledNode.left);
                }

                nodeCountInQueue--;
            }
            
            Double average = sum/currentNodeCount;
            
            if(res.size() > level){
                res.set(level, average);
            } else {
                res.add(level, average);
            }

            level++;
        }
        

        
    }
}