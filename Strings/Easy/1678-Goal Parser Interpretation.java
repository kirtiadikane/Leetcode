https://leetcode.com/problems/goal-parser-interpretation/

class Solution {
    public String interpret(String command) {
        StringBuilder str= new StringBuilder();
        for(int i = 0; i < command.length(); i++) {
          char c = command.charAt(i);
        	if(c == 'G' ) {
                str.append('G');
            }
            else if(c == '(' )
            {
                if (command.charAt(i+1) == ')' ) {
                    str.append('o');
        		    i++;
                }
        		else {
        		   str.append("al");
        		   i+=3;
        	    }
            }
           
        }
         return str.toString();
    }   
}
