/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //deal in a reverse order
        while (m > 0 && n > 0) {
            if(nums1[m-1] > nums2[n-1]) {
                nums1[m+n-1] = nums1[m-1];
                m--;
            }
            else {
                nums1[m+n-1] = nums2[n-1];
                n--;
            }
        }
        while(n > 0) {
            nums1[m+n-1] = nums2[n-1];
                n--;
        }
    }
}
