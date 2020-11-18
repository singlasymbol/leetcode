// Problem statement: https://leetcode.com/explore/challenge/card/november-leetcoding-challenge/566/week-3-november-15th-november-21st/3532/
class Solution {
    
    int getSum(TreeNode node, int sum, int low, int high) {
    
        if(node == null) {
            return 0;
        }
        int leftSum = 0;
        int rightSum = 0;

        if(node.val >= low) {
            leftSum = getSum(node.left, sum, low, high);
        }

        if(node.val <= high) {
            rightSum = getSum(node.right, sum, low, high);
        }
        
        if(node.val >= low && node.val <= high) {
            sum = sum + node.val;
        }

        return leftSum + rightSum + sum;
    
    }
    
    public int rangeSumBST(TreeNode root, int low, int high) {
        return getSum(root, 0, low, high);
    }
}