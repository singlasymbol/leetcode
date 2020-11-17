// Problem Statement: https://leetcode.com/problems/arithmetic-subarrays/
class Solution {
  public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
    List<Boolean> res = new ArrayList<Boolean>(l.length);
    for(int i = 0; i < l.length; i++) {
      int rangeStart = l[i];
      int rangeEnd = r[i];
      if(rangeStart == rangeEnd) {
        res.add(true);
      } else{
        int []copy = Arrays.copyOfRange(nums, rangeStart, rangeEnd + 1);
        Arrays.sort(copy);
        boolean found = false;
        int diff = -1;
        for(int j = 0; j < copy.length - 1; j++) {
            int currDiff = copy[j + 1] - copy[j];
            if(diff != currDiff && diff != -1) {
                res.add(false);
                found = true;
                break;
            } else {
                diff = currDiff;
            }
        }
        if(!found)
            res.add(true);
      }
    }
    return res; 
  }
}