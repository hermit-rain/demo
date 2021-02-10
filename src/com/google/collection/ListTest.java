package com.google.collection;

import java.util.*;

/**
 * 描述了java的ArrayList集合、LinkedList集合以及java集合遍历的一些常用方法
 *
 *
 * LinkedList类是List接口的实现类，可以根据索引来随机访问集合中的元素，LinkedList可以被当成List使用
 * LinkedList实现了Deque接口，可以被当成双端队列来使用，因此既可以被当成“栈”，也可以被当成“队列”使用
 * LinkedList与ArrayList、ArrayDeque的实现机制完全不同
 * ArrayList、ArrayDeque内部是以数组的形式来保存集合中的元素，因此随机访问集合元素有较好的性能

 * LinkedList内部是以链表的形式来保存集合中的元素，随机访问集合元素性能较差
 * 但是在插入、删除元素时比较出色（只需改变指针所指的地址即可）
 */

public class ListTest {

   public static void main(String[] args){
       //应用泛式进行定义数组
       List <String> list =new ArrayList<String>();
       list.add("hello world");
       list.add("hello Ajax");
       list.add("hello today very well");

       System.out.println(list);

        //向指定位置上添加集合元素
       list.add(1,"hello erp good 11111111111111");
       System.out.println(list);
        //删除指定位置元素
       list.remove(2);
       System.out.println(list);
        //替换指定位置的集合元素
       list.set(0,"study heard");
       System.out.println(list);
       //判断集合元素在集合中的位置
       System.out.println(list.indexOf("study heard"));


       //对集合进行遍历
       //使用for-Each进行遍历数组
       for(String str:list){
           System.out.println(str);
       }
       //把链表变成数组相关的内容进行遍历
       String[] strArray =new String[list.size()];
       list.toArray(strArray);
       for(int i=0;i<strArray.length;i++){
           System.out.println(strArray[i]);
       }

       //使用迭代器进行遍历
       Iterator<String> ite = list.iterator();
       while(ite.hasNext()){
           System.out.println(ite.next());
       }

        //使用ListIterator()方法对集合进行遍历
       ListIterator iter = list.listIterator();

       while (iter.hasNext()){
           System.out.println(iter.next());
       }
       System.out.println("=======下面开始反向迭代=======");
       while (iter.hasPrevious()){
           System.out.println(iter.previous());
       }

       //通过sort()方法对集合进行排序  使用目标类型为Comparator的Lambda表达式对List集合排序
       list.sort((o1, o2)->((String)o1).length()-((String)o2).length());
       System.out.println(list);

       //使用目标类型为UnaryOperator的Lambda表达式来替换集合中所有元素
       //该Lambda表达式控制使用每个字符串的长度作为新的集合元素
       list.replaceAll(ele-> String.valueOf(((String)ele).length()));
       System.out.println(list);


       //描述了java的LinkedList集合
       LinkedList link = new LinkedList();
       LinkedList link1 = new LinkedList();

       //offer()-队列 元素加入队列的尾部
       link.offer("疯狂java讲义");
       link.offer("轻量级Java EE企业应用实战");
       link.offer("疯狂Android讲义");

       System.out.println(link);

       //push()-栈 将元素加入到栈的顶部
       link1.push("疯狂java讲义");
       link1.push("轻量级Java EE企业应用实战");
       link1.push("疯狂Android讲义");

       System.out.println(link1);

       for (int i=0;i<link1.size();i++){

           System.out.println("遍历中："+link1.get(i));
       }


   }


}
