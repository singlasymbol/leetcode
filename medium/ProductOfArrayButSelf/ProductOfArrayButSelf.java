// PS: https://leetcode.com/problems/product-of-array-except-self/
// Approach - Maintain two arrays maintaining product going forward and coming backward.
// And in the resultant array will be product of forwardArray[index -1] and backwardArray[index + 1]

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] forwardProduct = new int[nums.length];
        int [] backwardProduct = new int[nums.length];
        int [] result = new int[nums.length];
        
        forwardProduct[0] = nums[0];
        backwardProduct[nums.length - 1] = nums[nums.length - 1];
        
        for(int i = 1; i < nums.length; i++) {
            forwardProduct[i] = forwardProduct[i - 1] * nums[i];
        }
        
        for(int i = nums.length - 2; i >= 0; i--) {
            backwardProduct[i] = backwardProduct[i + 1] * nums[i];
        }
        
        result[0] = backwardProduct[1];
        result[nums.length - 1] = forwardProduct[nums.length - 2];
        for(int i = 1; i < nums.length - 1; i++) {
            result[i] = forwardProduct[i - 1] * backwardProduct[i + 1];
        }
        
        
        return result;
    }
}