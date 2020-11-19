//PS: https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/submissions/
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> hm = new HashMap<Integer, List<Integer>>();
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i = 0; i <  groupSizes.length;i++) {
            int currentGroupSize = groupSizes[i];
            List<Integer> list;
            
            if(!hm.containsKey(currentGroupSize)) {
               list = new ArrayList<Integer>();
            } else {
               list = hm.get(currentGroupSize);
            }
           
            list.add(i);
            hm.put(currentGroupSize, list);
            if(list.size() == currentGroupSize) {
                res.add(list);
                hm.remove(currentGroupSize);
            } else {
                
            }
            
        }
        
        return res;
    }
}