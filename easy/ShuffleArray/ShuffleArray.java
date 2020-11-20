//PS: https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] res = new int[nums.length];
        int j = 0;
        for(int i = 0; i < nums.length / 2; i++) {
            res[j] = nums[i];
            res[j + 1] = nums[i + n/+ 1];
            j = j + 2;
        }
        
        return res;
    }
}