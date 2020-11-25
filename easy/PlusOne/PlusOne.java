// PS : https://leetcode.com/problems/plus-one/submissions/
class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int sum = 0;
        for(int i = digits.length - 1; i >= 0; i--) {
            
            digits[i] = digits[i] + carry;
            if(digits[i] > 9) {
                digits[i] = 0;
                carry = 1;
            } else {
                carry = 0;
                break;
            }
            
        }
        
        if(carry == 1) {
            int [] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        
        return digits;
    }
}