package com.study.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 * <p>
 * Example 1:
 * <p>
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 * <p>
 * Input: "cbbd"
 * Output: "bb"
 * 思路：
 * 1. 将字符串转成字符数组，定义一个临时的stringBuilder
 * 2. 遍历字符数组，如果遍历到的字符不在stringBuilder中，放进stringBuilder去。
 * 3. 如果遍历到的字符在stringBuilder中，将stringBuilder放在list，清空stringBuilder。
 * 4. 遍历list，取除最长的字符串长度。
 */
public class LongestPalindromicSubstring {
    //abbda
    private boolean isPalindromeNumber(char[] ch, int start, int end) {
        if (ch.length <= 1) {
            return true;
        } else {
            while (start < end) {
                if (ch[start] == ch[end]) {
                    start++;
                    end--;
                } else {
                    return false;
                }
            }
            return true;
        }
    }

    private String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        } else {
            char[] ch = s.toCharArray();
            int len = ch.length;
            while (len > 0) {
                for (int i = 0; i <= ch.length - len; i++) {
                    boolean flag = isPalindromeNumber(ch, i, i + len - 1);
                    if (flag) {
                        return s.substring(i, i + len);
                    }
                }
                len--;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring ll = new LongestPalindromicSubstring();

        String string1 = "babad";
        String res1 = ll.longestPalindrome(string1);
        System.out.println(res1);

        String string2 = "cbbd";
        String res2 = ll.longestPalindrome(string2);
        System.out.println(res2);

        String string3 = "d";
        String res3 = ll.longestPalindrome(string3);
        System.out.println(res3);

        String string4 = " ";
        String res4 = ll.longestPalindrome(string4);
        System.out.println(res4);

        String string5 = "";
        String res5 = ll.longestPalindrome(string5);
        System.out.println(res5);

        String string6 = "asbnbsdb";
        String res6 = ll.longestPalindrome(string6);
        System.out.println(res6);
    }
}