class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] hash = new int[26];
        // Arrays.fill(hash, 0);
        
        for(int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < t.length(); i++) {
            if(hash[t.charAt(i) - 'a'] == 0) {
                return false;
            }
            hash[t.charAt(i) - 'a']--;
        }   
        
        for(int i = 0; i < 26; i++) {
            if(hash[i] != 0) {
                return false;
            }
        }   
        
        return true;
    }
}