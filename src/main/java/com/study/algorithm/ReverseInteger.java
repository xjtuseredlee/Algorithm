package com.study.algorithm;

public class ReverseInteger {
    private static int reverseInteger(int x) {
        if (0 == x) {
            return 0;
        }
        if (x < 10 && x > -10) {
            return x;
        }

        char[] a = String.valueOf(x).toCharArray();

        if (x > 0) {
            for (int i = 0; i < a.length / 2; i++) {
                swap(a, i, a.length - 1 - i);
            }
        } else {
            for (int i = 0; i < a.length / 2; i++) {
                swap(a, i + 1, a.length - 1 - i);
            }
        }
        long result = Long.valueOf(String.valueOf(a));
        return ((result > Integer.MAX_VALUE) || (result < Integer.MIN_VALUE)) ? 0 : (int) result;
    }

    private static void swap(char[] list, int start, int end) {
        char tmp = list[start];
        list[start] = list[end];
        list[end] = tmp;
    }

    public static void main(String[] args) {

        int x1 = 123;
        int y1 = reverseInteger(x1);
        System.out.println("x reverse Integer is:" + y1);

        int x2 = -123;
        int y2 = reverseInteger(x2);
        System.out.println("x reverse Integer is:" + y2);

        int x3 = -2147483648;
        int y3 = reverseInteger(x3);
        System.out.println("x reverse Integer is:" + y3);

    }
}
