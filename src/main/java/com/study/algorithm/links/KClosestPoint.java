package com.study.algorithm.links;
//https://codechina.org/2019/07/leetcode-973-k-closest-points-to-origin-sort-java/


import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

class Distince {
    Double dis;
    int index;
}

/**
 * 思路整理：
 */
public class KClosestPoint {

    private static int[][] KclosestPoints(int[][] points, int num) {
        int i = 0;
        List<Distince> distinces = new ArrayList<Distince>();
        for (int[] point : points) {
            Distince distince = new Distince();
            distince.index = i;
            distince.dis = Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));
            distinces.add(distince);
            i++;
        }
        //排序
        Collections.sort(distinces, new Comparator<Distince>() {
            public int compare(Distince o1, Distince o2) {
                return o1.dis.compareTo(o2.dis);
            }
        });
        int[][] result = new int[num][2];
        for (int j = 0; j < num; j++) {
            result[j] = points[distinces.get(j).index];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] points2 = {{1, 3}, {-2, 2}};
        int K1 = 1;
        int res1[][] = KclosestPoints(points2, K1);

        System.out.println("res1:" + Arrays.deepToString(res1));
        int[][] points3 = {{3, 3}, {5, -1}, {-2, 4}};
        int K2 = 2;
        int res2[][] = KclosestPoints(points3, K2);
        System.out.println("points3:" + Arrays.deepToString(points3));

        System.out.println("res2:" + Arrays.deepToString(res2));


    }
}