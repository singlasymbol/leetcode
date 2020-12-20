class Solution {
    
    public boolean canReach(int index, int[] nums, int[] memo) {
        
        if(index > nums.length) {
            return false;
        }
        
        if(index == nums.length - 1) {
            return true;
        }
        
        if(memo[index] != -1) {
            return (memo[index] == 1);
        }
        
        boolean res = false;
        for(int i = nums[index];i > 0; i--) {
            int newIndex = index + i;

            if(newIndex < nums.length) {
                res = res || canReach(newIndex, nums, memo);
                if(res) {
                    memo[newIndex] = 1;
                    return true;
                } else {
                    memo[newIndex] = -1;    
                }
            }
        }
        memo[index] = -1;
        return false;
    }
    
    public boolean canJump(int[] nums) {
        int []memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return canReach(0, nums, memo);
    }
}