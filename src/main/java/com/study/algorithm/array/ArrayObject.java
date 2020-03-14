package com.study.algorithm.array;

public class ArrayObject {
    public static void main(String[] args) {
        int size = 10;
        double[] array = new double[size];
        array[0] = 2.0;
        array[1] = 11.0;
        array[2] = 12.0;
        array[3] = 144.3;
        array[4] = 23.0;
        array[5] = 3.0;
        array[6] = 14.0;
        array[7] = 16.0;
        array[8] = 16.70;
        array[9] = 234.07;

        double total = 0;
        for (double v : array) {
            total += v;
        }
        System.out.println("total:" + total);

    }
}
