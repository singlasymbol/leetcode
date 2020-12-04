class Solution {
    public int getCount(int n, HashMap<Integer, Integer> hm) {
        
        if(n < 0 ) {
            return 0;
        }
        
        Integer get = hm.get(n);
        if(get == null) {
            if(n == 1) {
                return 1;
            }

            if(n == 2) {
                return 2;
            }

            int countOneStep = getCount(n - 1, hm);
            int countTwoSteps = + getCount(n - 2, hm);
            hm.put(n - 1, countOneStep);
            hm.put(n - 2, countTwoSteps);
            
            return countOneStep + countTwoSteps;
        }
        
        return get;
    }
    
    public int climbStairs(int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        return getCount(n, hm);
    }
}