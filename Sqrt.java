//https://leetcode.com/problems/sqrtx/
// 69. Sqrt(x)
package com.dsa.binarySearch;

public class MainSqrt {

	public static void main(String[] args) {
		int num = 4;
		System.out.println(mySqrt(num));

	}
	static int mySqrt(int x) {
		int start = 1;
		int end = x/2;
		int sqrt = 0;
		if(x<=1) {
			return x;
		}
		
		while(start<=end) {
			int mid = start + (end-start)/2; 
			long m = (long)mid * (long)(mid);
			if(m > x) {
				end = mid-1;
			}
			else {
				sqrt = mid;	
				start = mid + 1;			
			}
		}
		
		return sqrt;      
    }

}
