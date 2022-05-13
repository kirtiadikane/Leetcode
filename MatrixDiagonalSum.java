// https://leetcode.com/problems/matrix-diagonal-sum/
// 1572. Matrix Diagonal Sum

//Optimized approach
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        int row = 0, col=0;
        while(row < n) {
        	sum += mat[row][col];
        	row++;
        	col++;
        }
        
        row=0;
        col=n-1;
        while(row < n) {
        	if(row != col ) 
        		sum += mat[row][col];
        	row++;
        	col--;
        }
        return sum;
    }
}

//Solution
/* 
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int row = 0; row < n; row++) {
        	for(int col=0;col < n;col++)
            {
                if(row==col || (row+col)==n-1) {
                	sum = sum + mat[row][col];
                }
            }
        }
        return sum;
    }
}
*/
