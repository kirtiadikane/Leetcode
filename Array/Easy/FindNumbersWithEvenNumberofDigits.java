// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
// 1295. Find Numbers with Even Number of Digits

class Solution {
    public int findNumbers(int[] nums) {
       int count=0;
		for(int num: nums) {
			if(numberOfDigits(num) % 2 == 0) {
				count++;
			}
		}		
		return count;		
	}
	
	//Optimized solution for counting digit
	static int numberOfDigits(int num) {
		if(num < 0) {
			num *= -1;
		}
		return (int)(Math.log10(num) + 1);
	}    
}
