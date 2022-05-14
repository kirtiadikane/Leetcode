//1480. Running Sum of 1d Array

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i=1; i < nums.length; i++){
            runningSum[i] = runningSum[i-1] + nums[i];
        }
        return runningSum;
    }
}

//OR
/*
class Solution {
public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
*/
