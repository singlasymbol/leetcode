// PS : https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/
class Solution {
    
    public boolean isNotFull(List<Integer> group) {
        return group.get(group.size() - 1) == -1 ; 
    }
    
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < groupSizes.length; i++) {
            boolean added = false;
            int groupSize = groupSizes[i];

            for(int j = 0; j < res.size(); j++) {
                List<Integer> currentGroup = res.get(j);
                if(currentGroup.size() == groupSize && isNotFull(currentGroup)) {
                    for(int k = 0; k < currentGroup.size(); k++) {
                        if(currentGroup.get(k) == -1) {
                            currentGroup.set(k,i);
                            break;
                        }
                    }
                    added = true;
                }
            }
            if(!added) {
                
                Integer [] arr = new Integer[groupSize];
                arr[0] = i;
                if(groupSize > 1) {
                    Arrays.fill(arr, 1, groupSize, -1);
                }
                List<Integer> newList = Arrays.asList(arr);

                res.add(newList);
                
            }
        }
        
        return res;
    }
}