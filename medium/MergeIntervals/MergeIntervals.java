// PS : https://leetcode.com/problems/merge-intervals/
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));   
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < intervals.length; i++) {
            int first = intervals[i][0];
            int second = intervals[i][1];
            int maxTillNow = second;
            boolean merged = false;
            
            while(i < intervals.length && maxTillNow >= intervals[i][0]) {
                maxTillNow = Math.max(intervals[i][1], maxTillNow);
                i++;
                merged = true;
            }
            // System.out.println("index " + i);
            if(merged) {i--;}
            
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.add(first);
            arr.add(maxTillNow);
            res.add(arr);
        }
        
        int[][] result = new int[res.size()][2];
        
        for(int i = 0; i < res.size(); i++) {
            ArrayList<Integer> temp = res.get(i);
            result[i][0] = temp.get(0);
            result[i][1] = temp.get(1);
        }
        
        return result;
        
        
    }
}