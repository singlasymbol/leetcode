class Solution {
    public int trap(int[] height) {
        int [] leftMax = new int[height.length];
        int [] rightMax = new int[height.length];
        int max = 0;
        
        for(int i = 0; i < height.length; i++) {
            leftMax[i] = max;
            max = Math.max(max, height[i]);
        }
        
        max = 0;
        for(int i = height.length - 1; i >= 0; i--) {
            rightMax[i] = max;
            max = Math.max(max, height[i]);
        }
        
        int res = 0;
        for(int i = 0; i < height.length; i++) {
            
            if(leftMax[i] == 0 || rightMax[i] == 0) { // no walls
                continue;
            } else if(height[i] >= leftMax[i] || height[i] >= rightMax[i]) { // current bar is bigger than adjacent bars;
                continue;
            } else {
                res = res + (Math.min(leftMax[i], rightMax[i]) - height[i]);
            }
            
        }
        
        return res;
    }
}