class Solution {
    public boolean validMountainArray(int[] arr) {
        
        int i = 1;
        int length = arr.length;
        
        while(i < length && arr[i] > arr[i - 1])
            i++;
        
        if(i == 1 || (i == length)) {
            return false;
        }
        
        while(i < length && arr[i] < arr[i - 1])
            i++;
        
        return (i == length);
    }
}