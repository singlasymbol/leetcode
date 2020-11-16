// ProblemStatement : https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int []xAxis = new int[points.length];
        
        for(int i = 0; i < points.length; i++) {
            xAxis[i] = points[i][0];
        }
        
        Arrays.sort(xAxis);
        int maxDiff = 0;
        
        for(int i = 0; i < xAxis.length - 1; i++) {
            if(xAxis[i + 1] - xAxis[i] > maxDiff) {
                maxDiff = xAxis[i + 1] - xAxis[i];
            }
        }
        
        return maxDiff;
    }
}