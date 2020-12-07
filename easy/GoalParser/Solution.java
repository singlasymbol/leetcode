class Solution {
    public String interpret(String command) {
        
        String res = "";
        String temp = "";
        
        for(int i = 0; i < command.length(); i++) {
            temp = temp + command.charAt(i);
            System.out.println("temp " + temp);
            if(temp.equals("G")) {
                res = res + "G";
                temp = "";
            } else if(temp.equals("()")) {
                res = res + "o";
                temp = "";
            } else if (temp.equals("(al)")) {
                res = res + "al";
                temp = "";
            }
        }
        
        return res;
    }
}