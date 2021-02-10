package com.google.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 描述了java集合中iterable接口及HasSet集合
 *
 * HasSet集合
 *
 * 集合中存入的对象是无序的
 * HashSet不是线程安全的，如果有多个线程同时访问一个HashSet,必须通过代码来同步
 * 集合元素值可以是null
 *
 * 向HasSet集合中存入对象的时候首先通过equal()方法判断两个对象的字符串值是否相等；
 * 若不等然后调用HasSet放法得到他们的hasCode值并通过他们的hasCode值进行存储
 * 存入对象的时候不能存入不同数据类型的数据因为他们不能通过equal（）方法进行比较
 * 并且存入的对象唯一不可重复
 *
 *  描述了集合 HashSet集合和 LinkedHashSet集合的不同
 *  他们都通过HasCode值进行决定元素的存储位置
 *  LinkedHashSet集合还通过链表的形式来来维护元素的顺序
 *  HashSet是无序的LinkedHashSet是按照集合的插入顺序进行存储的
 *  LinkedHashSet需要维护元素的插入顺序所以性能没有HashSet好
 *
 */
public class HashSetTest {

     public static void main(String[] args){

         //创建一个集合
         Collection StuInformation = new HashSet();

         StuInformation.add("李勇");
         StuInformation.add("刘红");
         StuInformation.add("王刚");
         //当添加重复的对象时候根本不执行也不会重复存入集合中0
         StuInformation.add("李勇");

         System.out.println(StuInformation);
         //输出HasSet方法中集合的个数
         System.out.println(StuInformation.size());

         //通过调用forEach方法用lambda表达式进行遍历
         StuInformation.forEach(obj->System.out.println("集合的元素是："+ obj));


         //通过传统的方法进行遍历
         for (Object str :StuInformation){
             //强制类型转换可有可无；
             String str1 = (String)str;
             System.out.println(str);
             System.out.println(str.hashCode());
         }

         //通过Iterator迭代器进行遍历
         Iterator it = StuInformation.iterator();
         while (it.hasNext()){
             String stu = (String)it.next();
             System.out.println(stu);
         }


         //比较HashSet集合和LinkedHashSet集合的异同
         Collection stuInformation2 = new HashSet();

         stuInformation2.add(1);
         stuInformation2.add(6);
         stuInformation2.add(85);
         stuInformation2.add(96);

         for(Object stu1 : stuInformation2){
             System.out.println(stu1);
         }

         Collection stuInformation1 = new LinkedHashSet();

         stuInformation1.add(1);
         stuInformation1.add(6);
         stuInformation1.add(85);
         stuInformation1.add(96);

         for(Object t : stuInformation1){
             System.out.println(t);

         }


     }
}
