package com.google.collection;

import java.util.Hashtable;

/**
 * 描述了java的HashTable集合
 * Hashtable是线程安全的，HashMap不是，因此，HashMap性能要比Hashtable高
 * Hashtable不允许使用null作为key和value，但是HashMap可以
 * 即使多个线程同时访问Map集合，也不建议使用Hashtable，推荐使用Collections工具类
 *
 * 判断两个key相等的标准同HashSet集合一样，只有当equals()返回true，并且hashcode()值一样时，两个key值才相等
 * 判断两个value相等的标准，只要当equals()返回true，两个value值就相等
 */

public class HashTableTest {

     public static void main(String[] args){

         //创建一个HashTable集合
         Hashtable ht = new Hashtable();
         ht.put(new A(100),"疯狂java讲义");
         ht.put(new A(200),"疯狂Ajax讲义");
         ht.put(new A(300),new B());
         ht.put(new B(),"疯狂ios讲义");
        //当向集合中插入相同key键的值时，会调用equals()方法进行比较 相等时将不会再次插入
         ht.put(new A(200),"疯狂Ajax讲义");

         System.out.println(ht);

        // 由于Hashtable中有一个B对象,它与任何对象通过equals()比较都相等
         System.out.println(ht.containsValue("测试字符串"));
         System.out.println(ht.containsKey(new A(100)));

         ht.remove(new A(200));
         System.out.println(ht);



     }
}

class A{
    int count;

    public A(int count){
        this.count = count;
    }


    public boolean equals(Object obj){

        if(obj == this) return true;
        if(obj != null &&obj.getClass() == A.class){
            A a = (A) obj;
            return this.count == a.count;
        }
        return false;
        }


    public int hashCode() {
        return this.count;
    }



}
//重写equals()方法 B对象与任何对象通过equals()方法比较都返回true
class B{
    public boolean equals(Object obj){
        return  true;
    }

}


