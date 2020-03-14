package com.study.algorithm.string;

public class StringObject {
    public static void main(String[] args) {
        String string = "we are waves of the same sea.";
        int index = string.indexOf("same");
        if (index == -1) {
            System.out.println("no find the word");

        } else {
            System.out.println("index:" + index);

        }
    }
}
