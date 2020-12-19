class Solution {
    
    int min(int x, int y) {
        return x < y ? x : y;
    }
    
    int calculateSum(int row, int col, int[][] grid, int [][]hashSum) {
        if(row >= grid.length || col >= grid[0].length ) {
            return -1;
        }
        
        if(hashSum[row][col] != 0) {
            return hashSum[row][col];
        }
        
        int downRes = calculateSum((row + 1), col, grid, hashSum);
        
        int rightRes = calculateSum(row, col + 1, grid, hashSum);
        
        if(downRes == -1 && rightRes == -1) {
            hashSum[row][col] = grid[row][col];
        } else if(downRes == -1) {
            hashSum[row][col] = grid[row][col] + rightRes;
        } else if(rightRes == -1) {
            hashSum[row][col] = grid[row][col] + downRes;
        } else {
            hashSum[row][col] = grid[row][col] + min(downRes, rightRes);
        }
        
        return hashSum[row][col];
    }
    
    public int minPathSum(int[][] grid) {
        
        int [][]hashSum = new int [grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length;j++) {
                if(hashSum[i][j] == 0)
                    hashSum[i][j] = calculateSum(i, j, grid, hashSum);
            }
        }
        
        return hashSum[0][0];
    }
}