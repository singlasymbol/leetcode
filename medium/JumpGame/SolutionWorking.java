//https://leetcode.com/problems/jump-game/submissions/

// Difference between this and solution.java is this one works when we use enums. 
enum Index {
    GOOD, BAD, UNKNOWN
}

class Solution {
    
    Index []memo;
    
    public boolean canReach(int index, int[] nums) {

        if(memo[index] != Index.UNKNOWN) {
            return (memo[index] == Index.GOOD);
        }
        
        int furthestJump = Math.min(index + nums[index], nums.length - 1);
        
        for(int i = index + 1; i <= furthestJump; i++) {
            if(canReach(i, nums)) {
                memo[i] =  Index.GOOD;
                return true;
            }
        }
        
        memo[index] = Index.BAD;
        return false;
    }
    
    public boolean canJump(int[] nums) {
        memo = new Index[nums.length];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = Index.UNKNOWN;
        }
        memo[memo.length - 1] = Index.GOOD;
        return canReach(0, nums);
    }
}