// Problem statement : https://leetcode.com/problems/find-all-duplicates-in-an-array/
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet st = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            int effectiveIndex = Math.abs(nums[i]) - 1;
            nums[effectiveIndex] = -nums[effectiveIndex];
            if(nums[effectiveIndex] > 0) {
                st.add(effectiveIndex + 1);
            }
        }
        
         Iterator<Integer> i = st.iterator();
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        while(i.hasNext()) {
            res.add(i.next());
        }
        
        return res;
    }
}