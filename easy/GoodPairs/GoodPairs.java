//PS: https://leetcode.com/problems/number-of-good-pairs/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int result = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])){
                result = result + hm.get(nums[i]);
                hm.put(nums[i], (hm.get(nums[i])) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        return result;
    }
}