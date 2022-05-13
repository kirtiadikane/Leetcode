// https://leetcode.com/problems/flipping-an-image/ 
//832. Flipping an Image


class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
		for(int row = 0; row < n; row++) {
        	for(int col=0; col < (n+1) / 2 ; col++)
            {
                int temp = image[row][col];
                image[row][col] = 1-image[row][n-col-1];
                image[row][n-col-1] = 1-temp; 
            }
        }
		return image;
    }
}

//OR
/*
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
		int[][] arr = new int[n][n];

        for(int row = 0; row < n; row++) {
        	for(int col = 0; col < n; col++) {
        		arr[row][col] = image[row][n-1-col];
        	}
        }
        for(int row = 0; row < n; row++) {
        	for(int col = 0; col < n; col++) {
        		if(arr[row][col] == 0) {
        			arr[row][col] = 1;
        		}else {
        			arr[row][col] = 0;
        		}
        	}  
        }
		return arr;
    }
}

*/
