https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        
        /*
        for(char c: sentence.toCharArray()){
            set.add(c);
        } 
        */
        
        for(int i=0; i<sentence.length(); i++){
            set.add(sentence.charAt(i));
        }
        
        return set.size() == 26; 
        
        
    }
}
