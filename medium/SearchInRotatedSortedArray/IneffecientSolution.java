// PS: https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

class Solution {
    
    public int findPivot(int [] nums, int low, int high, int leftBoundary) {
        
        if(nums.length == 1) {
            return 0;
        }
        
        // System.out.println("low: " + low + " high: " + high);
        if(low > high) {
            return 0; // unable to findPivot
        }
        
        int mid = (low + high)/ 2;

        if(mid == 0){
            if(nums[mid] < nums[mid + 1])  {
                return mid;
            } else {
                return findPivot(nums, mid + 1, high, leftBoundary);
            }
        }
        
        if(mid == nums.length - 1) {
            if(nums[mid] < nums[mid - 1]) {
                return mid;
            } else {
                return findPivot(nums, low, mid - 1, leftBoundary);
            }
        }
        
        if(nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
            return mid;
        }
        
        if(nums[mid] > leftBoundary) {
            return findPivot(nums, mid + 1, high, leftBoundary);
        }
        
        return findPivot(nums, low, mid -1, leftBoundary);
        
    }
    
    int findNumber(int []nums, int low, int high, int target) {
        if(low > high) {
            return -1;
        }
        
        int mid = (low + high)/2;
        if(nums[mid] == target) {
            return mid;
        }
        
        if(nums[mid] > target) {
            return findNumber(nums, low, mid - 1, target);
        }
        
        return findNumber(nums, mid + 1, high, target);
    }
    
    public int search(int[] nums, int target) {
        
        int pivot = findPivot(nums , 0, nums.length - 1, nums[0]);
        System.out.println("pivot: " + pivot);
        if(nums[pivot] == target) {
            return pivot; //saving extra call;
        }
        
        if(target >= nums[pivot] && target <= nums[nums.length - 1]) {
            return findNumber(nums, pivot, nums.length - 1, target);
        }
        return findNumber(nums, 0, pivot - 1, target);
    }
}