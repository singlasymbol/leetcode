// Problem Statement: https://leetcode.com/problems/get-maximum-in-generated-array/
class Solution {
    
    static int []hashArray;
    
    int getValue(int n) {
        if(n < 0) {
            return -1;
        }
        
        if(n == 0) {
            return 0;
        }
        
        if(n == 1) {
            return 1;
        }
        
        if(hashArray[n] != -1) {
            return hashArray[n];
        }
        
        if(n % 2 == 0) {
            hashArray[n] = getValue(n/2);
        } else {
            hashArray[n] = getValue(n/2) + getValue((n/2) + 1);
        }
        
        return hashArray[n];
    }
    
    public int getMaximumGenerated(int n) {
        hashArray = new int[n + 1];    
        Arrays.fill(hashArray, -1);
        if(n == 0) {
            return 0;
        }
        
        if(n == 1) {
            return 1;
        }
        hashArray[0] = 0;
        hashArray[1] = 1;
        
        
        for(int i = n; i >= 0; i--) {
            if(hashArray[i] == -1) {
                getValue(i);
            }
        }
        
        int max = -1;
        
        for (int i = 0; i < hashArray.length; i++) {
            if(hashArray[i] > max) {
                max = hashArray[i];
            }
        }

        
        return max;
    }
}