// PS : https://leetcode.com/problems/unique-number-of-occurrences/
// 1207. Unique Number of Occurrences

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(hm.get(arr[i]) != null) {
                hm.put(arr[i], (hm.get(arr[i]) + 1));
            } else {
                hm.put(arr[i], 1);
            }
        }
        
        Set<Integer> set = new HashSet<>();
        
        for(Integer values : hm.values()) {
            if(set.contains(values)) {
                return false;
            } else {
                set.add(values);
            }
        }
        
        return true;
    }
}