class Solution {
    
    public int binarySearch(int [] arr, int low, int high) {
        if(low > high) {
            return -1;
        }
        
        int mid = (low + high)/2;
        
        if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
            return mid;
        }
        
        
        if(arr[mid] > arr[mid - 1]) {
            return binarySearch(arr, mid, high);
        }
        
        return binarySearch(arr, low, mid);
        
    }
    
    
    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr, 0, arr.length - 1);
    }
}