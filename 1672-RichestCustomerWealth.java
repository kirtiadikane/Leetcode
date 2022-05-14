//1672. Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
       int wealth = Integer.MIN_VALUE;
       int max;
       for(int i=0; i < accounts.length; i++){
           max = 0;
           for(int j=0; j < accounts[i].length ; j++){
               max = max + accounts[i][j];
           }
           if(max > wealth){   //or wealth= Math.max(wealth, max );
               wealth = max;
           }
       }    
    return wealth;
  }
}
