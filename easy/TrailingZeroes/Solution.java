class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while(n/5 != 0) {
            res = res + n/5;
            n = n/5;
        }
        
        return res;
    }
}