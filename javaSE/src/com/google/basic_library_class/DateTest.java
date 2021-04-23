package com.google.basic_library_class;


import java.util.Date;

/**
 * 描述了Data类
 *
 * Data类共有两种构造器分别是无参和有参数的构造器
 * Date()   生成一个代表当前日期时间的对象
 * Date(long date) 根据指定的long型整数来生成一个Date对象
 *
 * 几个重要的成员方法
 * boolean after(Date date)：判断当前日期是否在date之后；
 * boolean before(Date date)：判断当前日期是否在date之前；
 * long  getTime()：返回该时间对应的long型整数，即从1970年1月1日00:00:00到当前对象之间的时间差
 * int compareTo(Date date)
 * 比较当调用此方法的Date对象和指定日期。两者相等时候返回0
 * 调用对象在指定日期之前则返回负数。调用对象在指定日期之后则返回正数
 */

public class DateTest {

    public static void main(String[] args){

        Date date =new Date();
        System.out.println(date.toString());
        Date date1 =new Date(System.currentTimeMillis());
        //注意参数的设置：  Date类的年份是以1900开头，以0月开头的；
        Date date2 = new Date(2020-1900,6-1,12);
        System.out.println(date1);
        System.out.println(date2);
        //返回当前时间对应的long型整数
        System.out.println(date.getTime());
        System.out.println(date.before(date2));
        System.out.println(date.after(date2));
        System.out.println(date.compareTo(date2));

    }
}
