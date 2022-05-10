// https://leetcode.com/problems/valid-perfect-square/
// 367. Valid Perfect Square

class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;
        while(start <= end){
            int mid = start + (end - start)/2;
            long sq = (long)mid * (long)mid;   // this one is imp (long) datatype otherwise gives time limit exceeded error
            
            if(sq > num){
                end = mid - 1;
            }
            else if(sq < num){
                start = mid + 1;
            }
            else{     //here sq == num
                return true;
            }
        }
        return false;
    }
}
