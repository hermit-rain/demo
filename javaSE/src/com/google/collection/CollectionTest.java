package com.google.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 描述了java的collection集合
 * 描述了java collection集合中所包含的一些方法
 *
 */

public class CollectionTest {

    public static void main(String[] args){
        //创建一个collection对象
        Collection c = new ArrayList();
        c.add("孙悟空");
        //虽然集合中不能放基本类型的值但是java可以自动装箱
        c.add(6);
        System.out.println(c);
        //输出c集合中元素的个数
        System.out.println("集合中元素的个数是："+c.size());
        //调用remove方法删除集合中的元素 注：若集合中有多个相同元素则只删除一个
        c.remove("孙悟空");
        System.out.println(c);
        //判断返回集合中是否含有指定元素
        System.out.println(c.contains(6));
        //清除集合c中的所有元素
        c.clear();
        System.out.println(c);
        //判断集合c是否为空
        System.out.println(c.isEmpty());

        System.out.println("应用于多个集合方法的实现：");
        Collection books = new HashSet();
        books.add("疯狂java EE 企业实战");
        books.add("hello java");
        books.add("疯狂 java 讲义");
        System.out.println("books集合中所有元素："+books);

        //判断是否将集合books中的所有元素添加到指定集合c中去
        System.out.println(c.addAll(books));
        System.out.println("c集合中的所有元素：" + c);

        books.add(6);

        //判断集合books集合中是否含有集合c中的所有元素
        System.out.println(books.containsAll(c));

        //从books集合中删除所有和c集合中元素相同的元素
        books.removeAll(c);
        System.out.println(books);
        System.out.println(c);

//        books.add(5);
//        System.out.println("当前集合books中的所有元素："+books);
//        //从集合books中删除所有和集合c中元素不同的元素  以至于返回的元素必定和c中相同
//        books.retainAll(c);
//        System.out.println(books);
//        System.out.println(c);


    }
}
