// PS: https://leetcode.com/problems/move-zeroes/
class Solution {
    
    public void swap(int []nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    
    public void moveZeroes(int[] nums) {
        int index = 0;
        
        
        while(index != nums.length - 1) {
            if(nums[index] == 0) {
                int j = index + 1;
                while(j < nums.length && nums[j] == 0) {
                    j++;
                }
                if(j != nums.length)
                    swap(nums, index, j);
                
                if(j == nums.length && nums[j - 1] == 0) {
                    break;
                }

            } 
            index++;
        }
        
    }
}