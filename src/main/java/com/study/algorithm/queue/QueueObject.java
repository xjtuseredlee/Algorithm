package com.study.algorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列是一种特殊的线性表，它只允许在表的前端进行删除操作，而在表的后端进行插入操作。
 *
 * LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
 *
 * 以下实例演示了队列（Queue）的用法：
 */
public class QueueObject {

    public static void queue(){
        Queue<String> queue = new LinkedList<String>();
        queue.offer("lihong");
        queue.offer("sunsiyu");
        queue.offer("renyuan");
        queue.offer("tianjian");
        queue.offer("yanchao");

        for(String q:queue){
            System.out.println("q:"+q);
        }

        System.out.println("queue.element:"+queue.element());
        for(String q:queue){
            System.out.println("q:"+q);
        }
        System.out.println("queue.peek:"+queue.peek());
        for(String q:queue){
            System.out.println("q:"+q);
        }
        //poll 去出第一个元素之后，移除。
        System.out.println("queue.poll:"+queue.poll());
        for(String q:queue){
            System.out.println("q:"+q);
        }
    }

    public static void main(String []args){
        queue();
    }
}
