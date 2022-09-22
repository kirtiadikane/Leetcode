// https://leetcode.com/problems/build-array-from-permutation/
// 1920. Build Array from Permutation

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
