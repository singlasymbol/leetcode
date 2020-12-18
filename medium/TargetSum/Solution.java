// Ps https://leetcode.com/problems/target-sum/submissions/
class Solution {
    
    
    int findTarget(int index, int []nums, int target, int currSum, String operation) {

        if(index > nums.length - 1) {
            return 0;
        }
        
        switch(operation) {
            case "ADD" :
                currSum = currSum + nums[index];    
                break;
            case "SUBTRACT":
                currSum = currSum - nums[index];
                break;
            default:
                break;
        }

        if(currSum == target && index == nums.length - 1) {
            return 1;
        }
        
        return findTarget(index + 1, nums, target, currSum, "ADD" ) +  findTarget(index + 1, nums, target, currSum, "SUBTRACT");
    }
    
    public int findTargetSumWays(int[] nums, int S) {
        
        if(nums.length == 1) {
            return (Math.abs(nums[0]) == Math.abs(S)) ? 1 : 0;
        }
        
        return  findTarget(1, nums, S, nums[0], "ADD") + findTarget(1, nums, S, nums[0], "SUBTRACT") + findTarget(1, nums, S, ((-1) * nums[0]), "ADD") + findTarget(1, nums, S, ((-1) * nums[0]), "SUBTRACT");
    }
}