// Problem link
// https://leetcode.com/problems/defuse-the-bomb/submissions/

class Solution {

    // This function is used to select the relevant index when the range goes out of arrayLength.    
    public int getNextElement(int index, int length) {
        if (index >= length || index < 0) {
            return (index % length);
        }
        
        return index;
    }
    
    // SolutionApproach: Keep an initial window sum using length k, and then keep on subtracting the next element and adding the window's new element as we move forward.
    // for negative k- the approach turns into keeping a gap between the window and current element effectively that is (size - 1 - k).
    // gap is used for cases when k is negative. the idea is to use one logic and just add a gap.
    // default value is zero for cases when k is positive
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        
        if(k == 0) {
            int [] arr = new int[n];
            Arrays.fill(arr, 0);
            return arr;
        } else {
            int currSum = 0;
            int gap = 0;
            if(k < 0) {
                gap = n + k - 1; 
            }
            k = Math.abs(k);
            int [] resultArray = new int[n];

            for(int i = 1; i <= k; i++){
                currSum += code[gap + i]; // getNextElement not needed due to constraints
            }
            
            for(int i = 0; i < n; i++) {
                resultArray[i] = currSum;
                currSum = currSum - code[getNextElement(i + gap + 1, n)] + code[getNextElement(i + k + gap + 1, n)];
            }
            
            return resultArray;
        } 


    }
}