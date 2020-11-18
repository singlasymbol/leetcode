// ProblemStatement: https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int [] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(hm.get(nums[i]) != null) {
               res[1] = i;
               res[0] = hm.get(nums[i]);
               break;
            } else {
                hm.put(diff, i);
            }
        }
        
        return res;   
    }
}