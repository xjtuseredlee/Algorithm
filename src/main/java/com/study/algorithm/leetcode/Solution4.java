package com.study.algorithm.leetcode;

import java.util.Arrays;

/**
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
public class Solution4 {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result;
        //合并数组
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i; j < nums1.length; j++) {
                arr[j] = nums1[i];
            }
        }
        for (int k = 0; k < nums2.length; k++) {
            for (int j = nums1.length + k; j < arr.length; j++) {
                arr[j] = nums2[k];
            }
        }
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.println("x:" + x);

        }
        int length = arr.length;
        System.out.println("length:" + length % 2);

        if (length % 2 == 0) {
            int x = arr[(length / 2) - 1];

            int y = arr[(length / 2)];

            result = ((x + y) / 2d);
        } else {
            result = arr[length / 2];

        }
        return result;
    }


    public static void main(String[] args) {

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        Solution4 solution4 = new Solution4();
        double xxx = solution4.findMedianSortedArrays(nums1, nums2);

        System.out.println("result01:" + xxx);


    }

}
