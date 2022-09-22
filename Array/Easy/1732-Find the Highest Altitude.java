https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
       int max=0, temp = 0;       
        for(int i = 0; i < gain.length; i++){         
           temp = temp + gain[i];
           if( temp > max ){
                max = temp;
           }
        }
        return max; 
    }
}
