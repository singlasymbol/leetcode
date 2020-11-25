// PS : https://leetcode.com/problems/excel-sheet-column-number/
class Solution {
    public int titleToNumber(String s) {
        
        int sum = 0;
        int multiplicationFactor = 0;
        
        for(int i = s.length() - 1; i >= 0 ; i--) {
            int number = s.charAt(i) - 'A' + 1;
            sum = sum + (((int)Math.pow(26, multiplicationFactor)) * number);
            multiplicationFactor++;
        }
        
        return sum;
    }
}