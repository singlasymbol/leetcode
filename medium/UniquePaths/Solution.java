class Solution {
    
    public int uniquePaths(int m, int n) {
        int [][]arr = new int[m + 1][n + 1];
        return getUniquePaths(m, n, 0, 0, arr);
    }

    
    public int getUniquePaths(int m, int n, int row, int col, int [][]arr)
    {
        if(row < 0 || col < 0 || row >= m || col >= n) {
            return 0;
        }
        
        if(row == m - 1 && col == n - 1) {
            return 1;
        }
        
        if(arr[row + 1][col] == 0) {
            arr[row + 1][col] = getUniquePaths(m, n, row + 1, col, arr);
        }
        
        if(arr[row][col + 1] == 0) {
            arr[row][col + 1] = getUniquePaths(m, n, row, col + 1, arr);
        }
        return  arr[row + 1][col]  + arr[row][col + 1];
    }
    
}