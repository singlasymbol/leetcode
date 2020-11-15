class Solution {
    public int getWinner(int[] arr, int k) {
        int forwardPtr = 1;
        int currPtr = 0;
        int count = 0;
        k = Math.min(arr.length, k);
        
        while ((currPtr <= (arr.length - 1)) && (forwardPtr <= (arr.length - 1))) {

            if(arr[currPtr] > arr[forwardPtr]) {
                count++;
                if(count >= k) {
                    return arr[currPtr];
                }
                forwardPtr++;
            } else {
                count = 1; // adding the smaller element;
                currPtr = forwardPtr;
                forwardPtr++;
                if(count >= k) {
                    return arr[currPtr];
                }
            }
        }
        
        return arr[currPtr];
        
    }
}