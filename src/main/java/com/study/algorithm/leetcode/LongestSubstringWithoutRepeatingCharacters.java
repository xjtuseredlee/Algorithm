package com.study.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * <p>
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 * <p>
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 思路：
 * 1. 将字符串转成字符数组，定义一个临时的stringBuilder
 * 2. 遍历字符数组，如果遍历到的字符不在stringBuilder中，放进stringBuilder去。
 * 3. 如果遍历到的字符在stringBuilder中，将stringBuilder放在list，清空stringBuilder。
 * 4. 遍历list，取除最长的字符串长度。
 */
public class LongestSubstringWithoutRepeatingCharacters {

    private int lengthOfLongestSubstring(String s) {
        List<String> lists = new ArrayList<String>();
        int len = 0;

        if (s == null || s.equals("")) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        } else {
            StringBuilder stringBuilder = new StringBuilder();

            char[] ch = s.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                for (int j = i; j < ch.length; j++) {

                    if (stringBuilder.indexOf(String.valueOf(ch[j])) < 0) {
                        stringBuilder.append(ch[j]);
                    } else {
                        lists.add(stringBuilder.toString());
                        stringBuilder.delete(0, stringBuilder.length());
                        break;
                    }
                }
            }
        }

        for (String list : lists) {
            if (list.length() > len) {
                len = list.length();
            }
        }
        return len;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters ll = new LongestSubstringWithoutRepeatingCharacters();
        String string = "abcabcbb";
        int res = ll.lengthOfLongestSubstring(string);
        System.out.println(res);

        String string2 = "b";
        int res2 = ll.lengthOfLongestSubstring(string2);
        System.out.println(res2);

        String string3 = "bbbbb";
        int res3 = ll.lengthOfLongestSubstring(string3);
        System.out.println(res3);

        String string4 = "pwwkew";
        int res4 = ll.lengthOfLongestSubstring(string4);
        System.out.println(res4);

        String string5 = "";
        int res5 = ll.lengthOfLongestSubstring(string5);
        System.out.println(res5);

        String string6 = "jbpnbwwd";
        int res6 = ll.lengthOfLongestSubstring(string6);
        System.out.println(res6);
    }
}