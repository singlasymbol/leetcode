// PS : https://leetcode.com/problems/validate-binary-search-tree/
class Solution {
    
    public boolean isValid(TreeNode node, long minValue, long maxValue) {
        if(node == null) {
            return true;   
        }
        
        if(node.val <= minValue || node.val >= maxValue) {
            return false;
        }
        
        return isValid(node.left, minValue, node.val) &&  isValid(node.right, node.val, maxValue);
    }
    
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}