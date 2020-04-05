package com.study.algorithm.leetcode;

/**
 * 10. Regular Expression Matching
 * Hard
 * <p>
 * 3738
 * <p>
 * 645
 * <p>
 * Add to List
 * <p>
 * Share
 * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
 * <p>
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * <p>
 * Note:
 * <p>
 * s could be empty and contains only lowercase letters a-z.
 * p could be empty and contains only lowercase letters a-z, and characters like . or *.
 * Example 1:
 * <p>
 * Input:
 * s = "aa"
 * p = "a"
 * Output: false
 * Explanation: "a" does not match the entire string "aa".
 * Example 2:
 * <p>
 * Input:
 * s = "aa"
 * p = "a*"
 * Output: true
 * Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
 * Example 3:
 * <p>
 * Input:
 * s = "ab"
 * p = ".*"
 * Output: true
 * Explanation: ".*" means "zero or more (*) of any character (.)".
 * Example 4:
 * <p>
 * Input:
 * s = "aab"
 * p = "c*a*b"
 * Output: true
 * Explanation: c can be repeated 0 times, a can be repeated 1 time. Therefore, it matches "aab".
 * Example 5:
 * <p>
 * Input:
 * s = "mississippi"
 * p = "mis*is*p*."
 * Output: false
 */
public class RegularExpressionMatching {
    private boolean isMatch(String s, String p) {
        if (s.equals(p)) {
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        RegularExpressionMatching matching = new RegularExpressionMatching();

        String s1 = "aa";
        String p1 = "a";
        System.out.println(matching.isMatch(s1, p1));

        String s2 = "aa";
        String p2 = "a*";
        System.out.println(matching.isMatch(s2, p2));

        String s3 = "aab";
        String p3 = "c*a*b";
        System.out.println(matching.isMatch(s3, p3));

        String s4 = "ab";
        String p4 = ".*";
        System.out.println(matching.isMatch(s4, p4));

        String s5 = "mississippi";
        String p5 = "mis*is*p*.";
        System.out.println(matching.isMatch(s5, p5));
    }
}
