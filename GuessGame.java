// https://leetcode.com/problems/guess-number-higher-or-lower/
// 374. Guess Number Higher or Lower

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
		int end = n;
		
        //binary search
		while(start<=end) {
			int mid = start + (end-start)/2; 
			int pick = guess(mid);
            if(pick == 0) {
				return mid;
			}
			else if(pick == 1) {
				start = mid + 1;
			} 
            else { //pick == -1
				end = mid - 1;			
			}
		}
		
		return 0;
    }
}
