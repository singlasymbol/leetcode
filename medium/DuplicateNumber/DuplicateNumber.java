//PS :https://leetcode.com/problems/find-the-duplicate-number/

// 1. First solution, Use extra space O(n) - hash
// 2. Second solution, sort, and find out adjacent duplicates.
// Add O(n) solution
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();;
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                return nums[i];
            }
            
            set.add(nums[i]);
        }
        
        return -1;
    }
}