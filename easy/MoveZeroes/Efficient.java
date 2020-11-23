class Solution {
    
    public void swap(int []nums, int idx1, int idx2) {
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] != 0) {
                swap(nums, i, nonZeroIndex);
                nonZeroIndex++;
            }
        }
    }
}