package com.google.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/**
 * 描述了java的Queue集合
 * PriorityQueue保存队列元素的顺序并不是按照加入队列的顺序，而是重新排序
 * 排序方式有自然排序和定制排序两种
 *
 * 描述了ArrayDeque集合作为队列和栈的两种实现方法
 *
 * 描述了peek()方法和poll()方法的区别
 */

public class QueueTest {
     public static void main(String[] args){

         //PriorityQueue 实现类
         PriorityQueue pq = new PriorityQueue();
         PriorityQueue pqNull = new PriorityQueue();


         pq.offer(-9);
         pq.offer(10);
         pq.offer(5);
         pq.offer(1);
         pq.offer(-100);
         System.out.println(pq);
         //获取集合的头部元素
         System.out.println(pq.element());
         //获取文件的头部元素并且删除它
         System.out.println(pq.poll());
         System.out.println(pq);

         //poll()方法如果集合没有元素则返回Null
         System.out.println(pqNull.poll());
         pqNull.offer(10);
         //获取队列头部元素当集合中无元素时不会返回null
         System.out.println(pqNull.remove());

        //ArrayDeque 当作栈使用
         ArrayDeque queue = new ArrayDeque();

         queue.push("No.1");
         queue.push("No.2");
         queue.push("No.3");

         //作为栈使用时候后进先出
         System.out.println(queue);
        //访问第一个元素，但并不将其pop出“栈”
         System.out.println(queue.peek());
         //pop出第一个元素
         System.out.println(queue.pop());
         System.out.println(queue);

         ///ArrayDeque 当作队列使用
         ArrayDeque queue1 = new ArrayDeque();
         queue1.offer("No.1");
         queue1.offer("No.2");
         queue1.offer("No.3");
         //相当于队列先进先出
         System.out.println(queue1);
     }


}
