package com.google.collection;

import java.util.TreeSet;

/**
 * 描述了java的TreeSet集合
 *
 * TreeSet是SortedSet接口的实现类，TreeSet集合可以确保集合里的元素处于排序状态
 * 与HashSet集合采用hash算法来护决定元素的存储位置不同，TreeSet采用红黑树的数据结构来存储集合元素。
 * TreeSet支持两种排序方法：自然排序和定制排序
 * 自然排序
 * TreeSet 会调用集合元素的 compareTo(Object obj) 方法来比较元素之间的大小关系，然后将集合元素按升序排列
 * 定制排序
 * 1.实现Comparable 接口
 * 2.重写compareTo()方法
 *
 */
public class TreeSetTest {


    public static void main(String[] args) {

        //自然排序
        // 创建一个TreeSet对象
        TreeSet number = new TreeSet();
        number.add(5);
        number.add(2);
        number.add(10);
        number.add(-9);

        System.out.println(number);
        System.out.println(number.first());
        System.out.println(number.last());
        //返回大于等于2 小于10的所有元素；
        System.out.println(number.subSet(2, 10));

        //定制排序
        //创建一个自定义类的TreeSet对象
        TreeSet<Person> stuInformation = new TreeSet();

        stuInformation.add(new Person("张三", 15));
        stuInformation.add(new Person("李四", 20));
        stuInformation.add(new Person("刘红", 25));
        stuInformation.add(new Person("小明", 30));


        System.out.println(stuInformation);

    }

}

//java.lang.ClassCastException 异常====> 没有实现 Comparable 接口不知道所以不知道到底按照何种排序的方法
/**
 * 创建一个 Person 类实现 Comparable接口并重写 compareTo()方法
 */
class Person implements Comparable{

    String name;
    int age;

    //定义构造器
    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        // 1 ==> 顺序输出
        return 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
