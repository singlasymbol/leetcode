class Solution {
    
    // pattern recognition.
    public int countVowelStrings(int n) {
        
        int result = 0;
        int []arr = new int[5];
        Arrays.fill(arr, 1);
        
        for(int i = 1; i < n ; i++) {
            for(int j = 3; j >= 0; j--) {
                arr[j] = arr[j] + arr[j + 1];
            }
        }
        
        for(int i = 0; i < 5; i++) {
            result = result + arr[i];
        }
        
        return result;
    }
}