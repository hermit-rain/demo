package com.google.collection;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * 描述了java的EnumSet集合
 * EnumSet是一个专门为枚举类设计的集合类，EnumSet中的元素必须是枚举类中的枚举值
 * EnumSet中的元素也是有序的，以枚举值在Enum类内的定义顺序来决定元素排列顺序
 * EnumSet是以位向量的方式来存储，占用内存小，运行效率高
 * EnumSet不允许插入null元素
 * EnumSet没有暴露构造器，只能通过类方法来创建对象
 *
 * 描述了EnumSet中noneOf、allOf、of、copyOf、complementOf、rang等方法来创建枚举类型的集合
 */
public class EnumSetTest {

    public static void main(String[] ags){

        //allOf 通过调用EnumSet方法创建枚举集合 集合元素为Season枚举类所有元素
        EnumSet seasonSet = EnumSet.allOf(Season.class);
        System.out.println(seasonSet);

        //noneOf 创建空的枚举集合
        EnumSet seaSet = EnumSet.noneOf(Season.class);
        System.out.println(seaSet);
        //手动添加两个元素
        seaSet.add(Season.Spring);
        seaSet.add(Season.Winter);
        System.out.println(seaSet);

        //of 以指定枚举元素创建EnumSet集合
        EnumSet seasonSet1 = EnumSet.of(Season.Fall,Season.Summer);
        System.out.println(seasonSet1);

        //rang 指定枚举范围来创建EnumSet集合
        EnumSet seasonSet2 = EnumSet.range(Season.Summer,Season.Winter);
        System.out.println(seasonSet2);

        //complementOf 以指定EnumSet集合对应枚举类元素的补集元素创建EnumSet集合
        EnumSet seasonSet3 = EnumSet.complementOf(seasonSet2);
        System.out.println(seasonSet3);

        //创建一个HashSet集合
        Collection c = new HashSet();
        c.clear();
        c.add(Season.Fall);
        c.add(Season.Winter);

        //copyOf 复制指定集合中的所有元素来创建EnumSet集合
        EnumSet seasonSet4 = EnumSet.copyOf(c);
        System.out.println(seasonSet4);

    }

    //创建枚举类
    enum Season{
        Spring,Summer,Fall,Winter
    }


}
