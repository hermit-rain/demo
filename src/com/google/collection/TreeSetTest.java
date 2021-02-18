package com.google.collection;


import java.util.TreeSet;

/**
 * 描述了java的TreeSet集合
 *
 * TreeSet是SortedSet接口的实现类，TreeSet集合可以确保集合里的元素处于排序状态
 * 与HashSet集合采用hash算法来护决定元素的存储位置不同，TreeSet采用红黑树的数据结构来存储集合元素。
 * TreeSet支持两种排序方法：自然排序和定制排序
 */
public class TreeSetTest {


    public static void main(String[] args){

        // 创建一个TreeSet对象
        TreeSet number =new TreeSet();
        number.add(5);
        number.add(2);
        number.add(10);
        number.add(-9);

        System.out.println(number);
        System.out.println(number.first());
        System.out.println(number.last());
        //返回大于等于2 小于10的所有元素；
        System.out.println(number.subSet(2,10));

        //自然排序
        //创建一个自定义类的TreeSet对象
        TreeSet<Person> stuInformation = new TreeSet();

        stuInformation.add(new Person("张三",15));
        stuInformation.add(new Person("李四",20));
        stuInformation.add(new Person("刘红",25));
        stuInformation.add(new Person("小明",30));


        stuInformation.forEach(obj->System.out.println("集合的元素是："+ obj.hashCode()));

        //定制排序
        //此处Lambda表达式的目标类型是Comparator通过lambda表达式调用compare()方法进行定制排序
        TreeSet ts = new TreeSet( (o1, o2) ->{
            M m1 =(M)o1;
            M m2 =(M)o2;
            //按照年龄的降序进行排序
            return m1.age > m2.age ? -1: m1.age < m2.age ? 1 : 0;
        });

        //创建ts对象
        ts.add(new M(99));
        ts.add(new M(25));
        ts.add(new M(3));
        ts.add(new M(100));

        System.out.println(ts);
    }


    //自定义M类
        static class M{
        int age;
        public  M(int age){
            this.age=age;
        }

        public String toString(){
            return "age"+age;
        }

    }

}
class Person{

    String name;
    int age;

    //定义构造器
    public  Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
