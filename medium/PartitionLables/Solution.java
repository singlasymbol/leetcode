//https://leetcode.com/problems/partition-labels/

class Solution {
    public List<Integer> partitionLabels(String S) {
        int [] hashArray = new int[26];
        
        for(int i = 0; i < S.length(); i++) {
            hashArray[S.charAt(i) - 'a'] = i;
        }
        
        int anchor = 0;
        int lastOccurrence = 0;
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i = 0; i < S.length();i++) {
            if(hashArray[S.charAt(i) - 'a'] > lastOccurrence) {
                lastOccurrence = hashArray[S.charAt(i) - 'a'];    
            }
            
            if(i == lastOccurrence) {
                res.add(lastOccurrence - anchor + 1);
                anchor = i + 1;
            }
        }
        
        return res;
    }
}