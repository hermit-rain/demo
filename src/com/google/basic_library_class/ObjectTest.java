package com.google.basic_library_class;

/**
 * 描述了Object类
 * Object类在java.lang包中，所有Java类都直接或间接扩展Object类
 * 所有Java类都是Object类的子类Object类是所有类的超类
 * Object类本身没有超类
 * Object类的引用变量可以保存任何类的对象的引用
 *
 * 几种常用的Object方法
 * public String toString() 我们可以自定义它， 它返回对象的字符串表示形式 通常它用于调试目的
 * 如果类中未重写该方法，则输出：”类名@十六进制的hashcode值”，若重写，则输出表述该对象信息的字符串
 * System.out.println(xx)，括号里面的“xx”对象如果不是String类型的话，就自动调用xx的toString()方法
 *
 * public boolean equals(Object obj)  它用于比较两个对象的相等性
 * public int hashCode()  它返回对象的哈希码（整数）值
 * 根据一定的规则将与对象相关的信息（比如对象的存储地址，对象的字段等）映射成一个数值，这个数值称作为散列值
 * protected void finalize() throws Throwable  它不是在Object类中实现 它在对象被销毁之前被垃圾收集器调用。
 * public final Class getClass() 它返回对象的Class对象的引用
 */
public class ObjectTest {

    public static void main (String[] args){

        String strObj = new String();
        ObjectTest obj = new ObjectTest();

        printClassInfo(strObj);
        printClassInfo(obj);


        String str1 =new String("123456");
        //调用hasCode方法输出对象的哈希值
        System.out.println("str字符串的哈希值为："+str1.hashCode());
        equalsTest(str1);
        //调用toString方法返回str对象的字符串形式
        System.out.println("返回str对象的字符串形式："+str1.toString());

    }


    //定义一个printClassInfo()方法来描述getClass()方法
    private static void printClassInfo(Object obj) {

        //获取类名
        System.out.println("类名：" + obj.getClass().getName());
        //获取父类名
        System.out.println("父类："+obj.getClass().getSuperclass().getName());
        //获取接口信息并输出
        for (int i = 0; i < obj.getClass().getInterfaces().length; i++) {
            System.out.println(obj.getClass().getInterfaces()[i]);
        }
    }

    //定义一个equalsTest方法来描述equals()方法
    public static boolean equalsTest(String str){
        String passworld = "123456";
        boolean con;
        if (str.equals(passworld)) con = true;
        else{
            con=false;
        }
        System.out.println(con);
        return  con;
    }



}
