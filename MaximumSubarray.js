/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let result = nums[0], sum = nums[0];
    for (let i = 1; i < nums.length; i++) {
        if(sum <= 0) sum = nums[i];
        else sum += nums[i];
        if (result < sum) result = sum;
    }
    return result;
};