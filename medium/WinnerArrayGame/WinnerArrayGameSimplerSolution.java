// Problem Statement: https://leetcode.com/problems/find-the-winner-of-an-array-game/
class Solution {
    public int getWinner(int[] arr, int k) {
        int currentElem = arr[0];
        int currentGreaterThan = 0;
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > currentElem) {
                currentElem = arr[i];
                currentGreaterThan = 1;
            } else {
                currentGreaterThan++;
            }
            
            if(currentGreaterThan == k) {
                return currentElem;
            }
        }
        
        return currentElem;
    }
}