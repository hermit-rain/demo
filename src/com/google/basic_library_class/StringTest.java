package com.google.basic_library_class;

/**
 * 描述String类 ,StringBuffer类和StringBuilder类以及StringBuilder类中主要用到的方法
 *
 * String 类一旦创建将不会改变
 * 几种常用的String类中带的方法
 * char charAt(int index) ：取字符串中的某一个字符，其中的参数index指的是字符串中序数。
 * 字符串的序数从0开始到length()-1
 *
 * int compareTo(String anotherString) ：当前String对象与anotherString比较。
 * 相等关系返回０；不相等时，从两个字符串第0个字符开始比较，返回第一个不相等的字符差
 * 另一种情况，较长字符串的前面部分恰巧是较短的字符串，返回它们的长度差
 *
 *  与String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象
 *  StringBuffer用法和StringBuilder一样，不过，StringBuffer是线程安全的
 *   StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder类
 */

public class StringTest {

    private static String str;

    public static void main (String[] args){

        //创建字符串
        String greeting ="hello world";
        System.out.println(greeting);

        //string和StringBuffer类的相互转换
        //注意：可以=解决scanner类输入字符串进行修改的问题
        String aa =new String("123456");
        StringBuilder bb = new  StringBuilder(aa);

        //初始化字符串 将字符转化成字符串
        char [] helloArray = {'a','b','c'};
        String arrayTest = new String(helloArray);
        System.out.println(arrayTest);

        //输出字符串的长度
        System.out.println(arrayTest.length());

        //取字符串中的特定字符
        System.out.println(arrayTest.charAt(1));

        //将两个字符串进行比较
        String str1 = new String("i love cat");
        String str2 = new String("i love cat");
        String str3 = new String("i love cat and dogs");
        String compareTest1 = new String("abcdef");
        String compareTest2 = new String("abghil");
        System.out.println(str1.compareTo(str2));
        //如果两个字符串的前面部分相等则返回指定字符串与目标字符的差值用当前的字符串长度减去指定字符串的长的
        System.out.println(str1.compareTo(str3));
        //若两个字符不等则从第0 个字符开始比较返回他们第一个不相等的字符的差值即 c-g
        System.out.println(compareTest1.compareTo(compareTest2));

        //连接两个字符串的方法
        String str4 ="我的github网站：";
        String str5 ="https://github.com/hermit-rain";
        System.out.println(str4.concat(str5));

        //描述StringBuilder类中主要使用的方法
        StringBuilder str6 = new StringBuilder("hello ");
        //追加
        System.out.println(str6.append("java"));
        //反转
        System.out.println(str6.reverse());
        //移除 从第一位开始到第3位之前
        System.out.println(str6.delete(1,3));
        //替换
        System.out.println(str6.insert(0,"hello java"));


    }

}
