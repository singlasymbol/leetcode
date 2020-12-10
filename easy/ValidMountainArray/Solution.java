class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean ascending = true;
        
        if(arr.length < 3) {
            return false;
        }
        
        for(int i = 1; i < arr.length; i++) {
            
            System.out.println("checking " + arr[i] + " ascending " + ascending);
            if(arr[i] == arr[i - 1]) {
                return false;
            }
            
            if(arr[i] > arr[i - 1] && ascending) {
                continue;
            }
            
            if(arr[i] < arr[i - 1] && ascending) {
                if(i == 1) {
                    return false; // no mountain head.
                }
                
                ascending = false;
                continue;
            }
            
            if(arr[i] < arr[i - 1] && !ascending) {
                continue;
            }
            
            return false;
        }
        
        if(ascending) { // there was on decreasing sequence;
            return false;
        }
        
        return true;
        
    }
}