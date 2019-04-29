/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int cin = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]  = digits[i] + cin;
            cin = 0;
            if(digits[i] >= 10) {
                cin = 1;
                digits[i] %= 10;
            }
        }
        if(cin == 1) {
            int[] res = new int[digits.length+1];
            res[0] = 1;
            for (int i = 1; i < res.length; i++) {
                res[i] = digits[i-1];
            }
            return res;
        }
        return digits;
    }
}

