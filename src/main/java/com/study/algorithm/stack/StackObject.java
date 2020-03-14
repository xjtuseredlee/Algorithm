package com.study.algorithm.stack;

import java.util.Stack;

public class StackObject {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("stack.empty():"+stack.empty());
        stack.push(new Integer("1"));
        stack.push("lihong");
        stack.push(new String("tianjian"));
        System.out.println("stack.empty():"+stack.peek());
        stack.pop();
        System.out.println("stack.empty():"+stack.peek());
        stack.pop();
        System.out.println("stack.empty():"+stack.peek());

        System.out.println("total:");
    }
}
