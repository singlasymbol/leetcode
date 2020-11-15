//Problem Statement : https://leetcode.com/problems/check-array-formation-through-concatenation/

class Solution {
    
    public boolean isContiguousSubArray(int []subArray, int []mainArray) {

        boolean isFirstElementPresent = false;
        int mainIndex = 0;
        
        for(mainIndex = 0; mainIndex< mainArray.length; mainIndex++) {
            if(subArray[0] == mainArray[mainIndex]) {
                isFirstElementPresent = true;
                break;
            }
        }
        
        if(!isFirstElementPresent) {
            return false;
        }
        
        
        int subArrayIndex = 1;
        mainIndex += 1;
        
        for (int j = 1; j < subArray.length; j++) {

            if(mainIndex >= mainArray.length) {
                return false;
            }
            
            if(subArray[j] != mainArray[mainIndex]) {
                return false;
            }
            mainIndex = mainIndex + 1;
        }
        
        return true;
    }
    
    public boolean canFormArray(int[] arr, int[][] pieces) {
        boolean res = true;
        
        for(int i = 0; i < pieces.length; i++) {
            int[] array = pieces[i];
            res = res && isContiguousSubArray(array, arr);
            if(res == false) {
                break;
            }
        }
        
        return res;
    }
}