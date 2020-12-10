class Solution {
    int stringCount = 0;
    
    
    void addVowel(String currentString, String vowelChar, int stringLength) {
        if(currentString.length() >= stringLength) {
            return;
        }
        
        currentString = currentString + vowelChar;
        if(vowelChar != "" && currentString.length() ==  stringLength) {
            // System.out.println("res " + currentString);
            stringCount++;
        }
        String lastChar = vowelChar;
        
        if(lastChar != "e" && lastChar != "i" && lastChar != "o" && lastChar != "u")
            addVowel(currentString, "a", stringLength);
        
        if(lastChar != "i" && lastChar != "o" && lastChar != "u")
            addVowel(currentString, "e", stringLength);
        
        if(lastChar != "o" && lastChar != "u")
            addVowel(currentString, "i", stringLength);

        if(lastChar != "u")
            addVowel(currentString, "o", stringLength);
        
        addVowel(currentString, "u", stringLength);
    }
    
    public int countVowelStrings(int n) {
        String currentString = "";
        addVowel(currentString, "", n);
        return stringCount;
    }
}