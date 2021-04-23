package com.google.basic_library_class;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 描述了Calendar类
 * Calendar类是一个抽象类，因此不能用构造器来创建对象，
 * 必须通过静态方法getInstance( )方法来获取Calendar对象
 * Calendar类可以直接对date的年份，月份或者日期进行更改
 *
 * 描述了Calendar的两种方法
 * roll以及add的区别
 * 
 */

public class CalendarTest {
    public static void main(String[] args){

        // 创建一个代表系统当前日期的Calendar对象
        Calendar c1 = Calendar.getInstance();
        Date date = c1.getTime();

        //创建一个指定时间的Calendar对象
        Calendar c2 =Calendar.getInstance();
        c2.set(2008,9,3);
        System.out.println(date);
        System.out.println(c2.getTime());

        //取出某个时间对象的具体年份月份以及日
        System.out.println(c2.get(Calendar.YEAR));
        System.out.println(c2.get(Calendar.MONTH));
        System.out.println(c2.get(Calendar.DATE));

        //更改年月日
         c1.add(Calendar.YEAR,2);
        //添加的月份数满12个月后年份会自动增加一位
         c1.add(Calendar.MONTH,10);
        // roll方法的月份增加只会改变月份，如果满12则会进行迭代
         c2.roll(Calendar.MONTH,10);
         c1.add(Calendar.DATE,10);

        System.out.println(c1.get(Calendar.YEAR));
        System.out.println(c1.get(Calendar.MONTH));
        System.out.println(c1.get(Calendar.DATE));
        System.out.println(c2.get(Calendar.MONTH));
        System.out.println(c1.get(Calendar.DATE));

        //Date类与Calendar类的相互转换
        //Date类转Calendar类
        Calendar cal1 = Calendar.getInstance();
        Date  date1 = cal1.getTime();
        //Calendar类转Date类
        Date date2 = new Date();
        Calendar cal2 =Calendar.getInstance();
        cal2.setTime(date2);

    }


}
