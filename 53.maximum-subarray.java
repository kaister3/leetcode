/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = -2147483648;
        int maxSum = sum;
        for (int num : nums) {
            /*
            if(sum <= num) {
                if(sum >= 0) {
                    sum += num;
                    maxSum = sum >= maxSum ? sum : maxSum;
                    continue;
                }
                sum = num;
            }
            else {
                sum += num;
            }
            maxSum = sum >= maxSum ? sum : maxSum;
            */
            //this is a reduced version :)
            if(sum <= num && sum <= 0) {
                sum = num;
            }
            else {
                sum += num;
            }
            maxSum = sum >= maxSum ? sum : maxSum;
        }
        return maxSum;
    }
}

