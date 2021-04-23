package com.google.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 描述了java的Map集合
 * HashMap、LinkedHashMap
 *
 * LinkedHashMap同LinkedHashSet类似， LinkedHashMap也使用了双向链表来维护key-value对的次序，
 * 该链表负责维护Map的迭代顺序，与键值对插入的顺序一致
 *
 */
public class MapTest {

    public static void main(String[] args){

        //创建一个hasMap集合
        Map bookInformation = new HashMap();

        bookInformation.put("疯狂java讲义",109);
        bookInformation.put("疯狂ios讲义",10);
        bookInformation.put("疯狂Ajax讲义",79);
        bookInformation.put("java",null);

        System.out.println(bookInformation);
        //多次存放的value值可以相等
        bookInformation.put("疯狂 java EE企业实战",79);
        //当添加相同的key-value键值对的时候集合会重新覆盖原来的key-value值 key值可以相等但是value值不可不等
        bookInformation.put("疯狂java讲义",99);
        System.out.println(bookInformation);
        //判断集合中是否含有指定的key键
        System.out.println(bookInformation.containsKey("疯狂java讲义"));
        //判断指定集合中是否含有指定的value值
        System.out.println(bookInformation.containsValue(10));

        //java8新增加的一些方法

        //替代指定key键之下的value值
        bookInformation.replace("疯狂Ajax讲义",100);

        //对指定的value值进行修改
        bookInformation.merge("疯狂ios讲义",10,(oldVal , param) -> (Integer)oldVal + (Integer)param);


        LinkedHashMap scores = new LinkedHashMap();
        scores.put("语文" , 80);
        scores.put("英文" , 82);
        scores.put("数学" , 76);

        // 调用forEach方法遍历scores里的所有key-value对
        // 按照插入顺序输出
        scores.forEach((key, value) ->
                System.out.println(key + "-->" + value));
    }




}
