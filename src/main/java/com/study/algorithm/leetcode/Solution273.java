package com.study.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert a non-negative integer to its english words representation.
 * Given input is guaranteed to be less than Math.pow(2,31) - 1.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: "One Hundred Twenty Three"
 * Example 2:
 * <p>
 * Input: 12345
 * Output: "Twelve Thousand Three Hundred Forty Five"
 * Example 3:
 * <p>
 * Input: 1234567
 * Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 * Example 4:
 * <p>
 * Input: 1234567891
 * Output: "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One"
 * <p>
 * 思路：2147483647  1,234,567,891
 * 1. <= 19
 * 2. <= 99
 * 3. <= 999
 * 6. <= 999999
 * 9. <= 999999999
 * 10. <= 999999999999
 */
public class Solution273 {

    public static String tens[] = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String nums[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven"
            , "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};


    public String numberToWords(int num) {
        String result = "";

        if (num <= 19) {
            result = result + nums[num];
        } else if (num <= 99) {
            result += tens[num / 10];
            if (num % 10 != 0) {
                result += " ";
                result += numberToWords(num % 10);
            }
        } else if (num <= 999) {
            result += numberToWords(num / 100);
            result += " Hundred";
            if (num % 100 != 0) {
                result += " ";
                result += numberToWords(num % 100);
            }
        } else if (num <= 999999) {
            result += numberToWords(num / 1000);
            result += " Thousand";
            if (num % 1000 != 0) {
                result += " ";
                result += numberToWords(num % 1000);
            }
        } else if (num <= 999999999) {
            result += numberToWords(num / 1000000);
            result += " Million";
            if (num % 1000000 != 0) {
                result += " ";
                result += numberToWords(num % 1000000);
            }
        } else if (num <= 999999999999L) {
            result += numberToWords(num / 1000000000);
            result += " Billion";
            if (num % 1000000000 != 0) {
                result += " ";
                result += numberToWords(num % 1000000000);
            }
        }
        return result;
    }


    public static void main(String[] args) {

        Integer num01 = 1234567;
        Solution273 solution273 = new Solution273();
        String result01 = solution273.numberToWords(num01);

        System.out.println("result01:" + result01);

    }

}
