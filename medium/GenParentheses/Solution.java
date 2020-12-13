// https://leetcode.com/problems/generate-parentheses/
class Solution {
    List<String> result;
    public List<String> generateParenthesis(int n) {
        result = new ArrayList<String>();
        makeCombinations(0, 0, n, "");
        return result;
    }
    
    
    void makeCombinations(int openCount, int closedCount, int n, String res) {
        if(res.length() == 2 * n) {
            result.add(res);
            return;
        }
        
        if(openCount < n)
            makeCombinations(openCount + 1, closedCount, n, res + "(");
        
        if(openCount > closedCount)
            makeCombinations(openCount, closedCount + 1, n, res + ")");
        
        return;
    }
    
    
}