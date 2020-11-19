// PS: https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int lCount = 0;
        int rCount = 0;
        int res = 0;
        
        for(int i = 0 ;i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                lCount++;
            } else {
                rCount++;
            }
            
            
            if(lCount == rCount) {
               res++;
               lCount = 0;
               rCount = 0;
            }
        }
        
        return res;
    }
}