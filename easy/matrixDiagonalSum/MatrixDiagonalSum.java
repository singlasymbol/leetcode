// Problem statement : https://leetcode.com/problems/matrix-diagonal-sum/
class Solution {
    public int diagonalSum(int[][] mat) {
        int matrixLength = mat[0].length;
        int sum = 0;
        for(int i = 0; i < matrixLength; i++) {
            sum += mat[i][i];
            sum += mat[i][matrixLength - i - 1];
        }
        
        if(matrixLength % 2 == 1) {
            sum = sum - mat[matrixLength/2][matrixLength/2];
        }
        return sum;
    }
}