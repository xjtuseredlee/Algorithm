package com.study.algorithm.leetcode;

import java.util.ArrayList;

import java.util.List;


/**
 * 996. Number of Squareful Arrays
 * Hard
 * <p>
 * 241
 * <p>
 * 18
 * <p>
 * Add to List
 * <p>
 * Share
 * Given an array A of non-negative integers, the array is squareful if for every pair of adjacent elements, their sum is a perfect square.
 * <p>
 * Return the number of permutations of A that are squareful.  Two permutations A1 and A2 differ if and only if there is some index i such that A1[i] != A2[i].
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: [1,17,8]
 * Output: 2
 * Explanation:
 * [1,8,17] and [17,8,1] are the valid permutations.
 * Example 2:
 * <p>
 * Input: [2,2,2]
 * Output: 1
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= A.length <= 12
 * 0 <= A[i] <= 1e9
 * <p>
 * 思路：
 * 1. 找出数组的组合
 * 2. 判断该组合是否为完全平方数
 * 3. 如果是加一。
 * 4. 输出总个数。
 */
public class Solution996 {

    public static boolean lowIsSquare(double num) {
        if (num < 0) {
            return false;
        }
        for (int i = 0; i <= num / 2; i++) {
            if (i * i == num)
                return true;
        }
        return false;
    }

    public int numSquarefulPerms(int[] A) {

        for (int i = 0; i < A.length - 1; i++) {
            double num = A[i] + A[i + 1];
            if (lowIsSquare(num)) {
                return 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

        int[] A = {1, 8, 17};
        List<int[]> lists = new ArrayList<int[]>();


        Solution996 solution996 = new Solution996();
        int xxx = solution996.numSquarefulPerms(A);

        System.out.println("xxx:" + xxx);


    }

}
