class Solution {
    
    int [] hashArray;
    
    int minCost(int index, int [] cost) {

        if((index == cost.length - 1) || (index == cost.length - 2)) {
            return cost[index];
        }
        
        if(hashArray[index] != (-1)) {
            return hashArray[index];
        }
        
        hashArray[index] = cost[index] + Math.min(minCost(index + 1, cost), minCost(index + 2, cost));
        return hashArray[index];
    }
    
    public int minCostClimbingStairs(int[] cost) {
        hashArray = new int[cost.length];
        Arrays.fill(hashArray, -1);
        return Math.min(minCost(0, cost), minCost(1, cost));
    }
}