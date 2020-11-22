// PS: https://leetcode.com/problems/product-of-array-except-self/submissions/
// Efficient: Used just one array to compute the final output, compared to threeArrays in previous solution.
// Approach - use the resultant array to form the forward sum;
// traverse from end to start
// now, keep a productcounter from the end, and keep assigning the elements in res array as
// res[index] = res[index - 1] * backwardSum, and keep updating backwardSum = backwardSum * currentElem;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int [] result = new int[size];
        
        result[0] = nums[0];
        
        for(int i = 1; i < size; i++) {
            result[i] = result[i - 1] * nums[i];
        }
        
        int backwardProduct = nums[size - 1];
        
        result[size - 1] = result[size - 2];
            
        for(int i = size - 2; i >= 1; i--) {
            result[i] = result[i - 1] * backwardProduct;
            backwardProduct = backwardProduct * nums[i];
        }
        
        result[0] = backwardProduct;
        
        return result;
    }
}


// Considering multiple zeroes.

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int [] result = new int[size];
        int zeroCount = 0;
        
        result[0] = nums[0];
        if(result[0] == 0) {
            zeroCount++;
        }
        
        for(int i = 1; i < size; i++) {
            result[i] = result[i - 1] * nums[i];
            if(nums[i] == 0) {
                zeroCount++;
                if(zeroCount >= 2) {
                    Arrays.fill(result, 0);
                    return result;
                }
            }
        }
        
        
        
        int backwardProduct = nums[size - 1];
        
        result[size - 1] = result[size - 2];
            
        for(int i = size - 2; i >= 1; i--) {
            result[i] = result[i - 1] * backwardProduct;
            backwardProduct = backwardProduct * nums[i];
        }
        
        result[0] = backwardProduct;
        
        return result;
    }
}