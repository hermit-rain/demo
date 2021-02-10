package com.google;

import java.util.TreeMap;

/**
 * 描述了java的TreeMap集合
 *
 * TreeMap就是一个红黑树数据结构，每个Key-value对即为红黑树的一个节点
 * TreeMap存储key-value对时，会根据key的大小进行排序。TreeMap也有两种排序方式
 *
 * 自然排序
 * TreeMap的所有key必须实现Comparable接口，而且所有的key应该是同一个类的对象，才能比较大小
 *
 * 定制排序
 * 创建TreeMap时，传入一个Comparator对象，重写其compare()方法，对所有的key进行排序
 *
 */

public class TreeMapTest {

    public static void main(String[] args){

        //创建一个TreeMap集合
        TreeMap tre = new TreeMap();

        tre.put(new R(2),"hello today");
        tre.put(new R(-5),"hello world");
        tre.put(new R(3),"hello java");

        System.out.println(tre);
        //输出集合的第一个key-value对
        System.out.println(tre.firstEntry());
        //输出集合的最后一个key值
        System.out.println(tre.lastKey());
        //返回该TreeMap的比new R(2)大的最小key值
        System.out.println(tre.higherEntry(new R(2)));
        //返回该TreeMap的比new R(3)小的最大的key-value对
        System.out.println(tre.lowerEntry(new R(3)));
        //返回该TreeMap的子TreeMap即指定对象范围内的key-value值
        System.out.println(tre.subMap(new R(-6) , new R(3)));

    }
}

class R implements Comparable{

    int count;
    public R(int count){
        this.count = count;
    }

    public String toString(){
        return "R[count:" + count + "]";
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj != null && obj.getClass() == R.class){
            R r = (R)obj;
            return r.count == this.count;
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        R r = (R)o;
        return count > r.count ? 1 :count < r.count ? -1 : 0;
    }
}
