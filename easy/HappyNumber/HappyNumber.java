class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        
        while(n != 1 && set.contains(n) == false) {
            set.add(n);
            n = sumOfAllDigits(n);
            // System.out.println("sum " + n);
        }
        
        if(n == 1) {
            return true;
        }
        
        return false;
    }
    
    public int sumOfAllDigits(int n) {
        int sum = 0;
        int num = n;
        
        while(n != 0) {
            num = n % 10;
            sum = sum + (int)Math.pow(num, 2);
            n = n / 10;
        }
        
        return sum;
    }
}


