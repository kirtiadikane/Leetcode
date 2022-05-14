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
