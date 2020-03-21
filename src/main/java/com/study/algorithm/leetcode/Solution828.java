package com.study.algorithm.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 828. Count Unique Characters of All Substrings of a Given String
 * Hard
 * <p>
 * 314
 * <p>
 * 33
 * <p>
 * Add to List
 * <p>
 * Share
 * Let's define a function countUniqueChars(s) that returns the number of unique characters on s, for example if s = "LEETCODE" then "L", "T","C","O","D" are the unique characters since they appear only once in s, therefore countUniqueChars(s) = 5.
 * <p>
 * On this problem given a string s we need to return the sum of countUniqueChars(t) where t is a substring of s. Notice that some substrings can be repeated so on this case you have to count the repeated ones too.
 * <p>
 * Since the answer can be very large, return the answer modulo 10 ^ 9 + 7.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "ABC"
 * Output: 10
 * Explanation: All possible substrings are: "A","B","C","AB","BC" and "ABC".
 * Evey substring is composed with only unique letters.
 * Sum of lengths of all substring is 1 + 1 + 1 + 2 + 2 + 3 = 10
 * Example 2:
 * <p>
 * Input: s = "ABA"
 * Output: 8
 * Explanation: The same as example 1, except countUniqueChars("ABA") = 1.
 * Example 3:
 * <p>
 * Input: s = "LEETCODE"
 * Output: 92
 */
public class Solution828 {


    public int uniqueLetterString(String s) {
        String str_reverse = reverse1(s);

        String str = "";
        int num = 0;
        Set<String> set = new HashSet<String>();
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                str = s.substring(i, j);
                set.add(str);
            }
        }
        for (String string : set) {
            num += string.length();
        }
        if (str_reverse.equals(s)) {
            num = num - 1;
        }
        return num;
    }

    public static String reverse1(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    public static void main(String[] args) {

        String s = "ABA";

        Solution828 solution828 = new Solution828();
        int xxx = solution828.uniqueLetterString(s);

        System.out.println("xxx:" + xxx);


    }

}
