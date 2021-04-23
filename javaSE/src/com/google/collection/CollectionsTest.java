package com.google.collection;

import java.util.*;

/**
 * 描述了java集合的工具类 Collections
 * 它可以操纵操作Set、List和Map等集合
 * 该工具类提供了大量方法，对集合元素进行排序、查询和修改等操作
 * 还提供了将集合对象设置为不可变、对集合对象实现同步等方法
 */

public class CollectionsTest {

    public static void main(String[] args){

        //创建一个存储数据的集合
        ArrayList number = new ArrayList();


        number.add(0);
        number.add(-5);
        number.add(100);
        number.add(3);
        number.add(0);

        System.out.println(number);
        //将List集合元素的次序反转
        Collections.reverse(number);
        System.out.println(number);
        //将list集合按照自然顺序进行排序
        Collections.sort(number);
        System.out.println(number);
        //将list集合按照随机的顺序进行排序
        Collections.shuffle(number);
        System.out.println(number);

        //通过Collections进行集合元素的查找
        System.out.println(Collections.max(number));
        System.out.println(Collections.min(number));

        //替换
        Collections.replaceAll(number,100,-100);
        System.out.println(number);

        System.out.println(Collections.frequency(number,0));

        //将指定集合包装成线程同步的集合
        //创建各种类型的线程安全的集合
        Collection c =  Collections.synchronizedCollection(new ArrayList<>());
        List list = Collections.synchronizedList(new ArrayList<>());
        Set set = Collections.synchronizedSet(new HashSet<>());
        Map map = Collections.synchronizedMap(new HashMap<>());


        //Collections提供了用来返回不可变的集合的类方法

        //创建一个空的不可变类
        List unmodifiedList = Collections.emptyList();

        //创建一个只有一个元素,且不可变的Set对象
        Set unmodifiedSet = Collections.singleton("hello world");
        System.out.println(unmodifiedSet);

        Map scores = new HashMap();
        scores.put("math",100);
        scores.put("music",60);

        System.out.println(scores);

        //返回普通的Map对象对应的不可变版本-相当于重新创建一个不可变集合
        Map unmodifiedMap = Collections.unmodifiableMap(scores);


        /**Java 9为Set、List、Map提供了of()方法可以直接创建包含N个元素的不可变集合
         * 不可变意味着程序不能向集合中添加元素，也不能从集合中删除元素。
         */

        Set s =  Set.of("harbin","shanghai","beijing");
        System.out.println(s);
        //java 异常
//        s.add("guangzhou");



    }
}
