package com.google.collection;

import java.util.EnumMap;

/**
 * 描述了java的EnumMap集合
 * EnumMap中所有key都必须是单个枚举类的枚举值
 * EnumMap在内部以数组形式保存，所以这种实现形式非常紧凑、高效。
 * EnumMap根据key的自然顺序（即枚举值在枚举类中的定义顺序）来维护key-value对的次序
 * EnumMap不允许使用null作为key值，但允许使用null作为value
 */

public class EnumMapTest {

    public static void main(String[] args){

        //创建一个EnumMap集合对象
        EnumMap emp = new EnumMap(Season.class);

        emp.put(Season.Spring,"春暖花开");
        emp.put(Season.Summer,"夏日炎炎");

        System.out.println(emp);

    }

}


//创建枚举类
enum Season{
    Spring,Summer,Fall,Winter
}