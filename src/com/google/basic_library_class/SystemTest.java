package com.google.basic_library_class;


/***
 * 描述了System类
 * System类中包括类有 3 个静态成员变量
 * 分别是 PrintStream out、InputStream in 和 PrintStream err
 * System主要包括了3个成员方法
 * arrayCopy() 方法 该方法的作用是数组复制，即从指定源数组中复制一个数组
 * currentTimeMillis() 方法 该方法的作用是返回当前的计算机时间
 * identityHashCode(Object x) 该方法返回指定对象的精确hashCode值
 * 描述了identityHashCode(Object x)与hashCode()两种方法的区别 *
 * Object的hashCode()默认是返回内存地址的，但是hashCode()可以重写，所以hashCode()不能代表内存地址的不同
 *
 * System.identityHashCode(Object x)方法可以返回对象的内存地址,不管该对象的类是否重写了hashCode()方法
 * 该方法返回指定对象的精确hashCode值，也就是根据该对象的地址计算得到的hashCode值，可以唯一地标识一个对象。
 *
 *判断两个对象是否是指向同一地址，应该用System.identityHashCode(Object x)方法进行判断 *
 *  */

public class SystemTest {

    public static void main (String[] args){


        //类方法arrayCopy
        // public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
        //src 表示源数组，srcPos 表示从源数组中复制的起始位置，dest 表示目标数组，destPos 表示要复制到的目标数组的起始位置，length 表示复制的个数。

        char[] srcArray = {'A','B','C','D'};
        char[] destArray = new char[4];
        System.arraycopy(srcArray,1,destArray,1,2);
        System.out.println("输出原数组：");
        for (int i=0;i<srcArray.length;i++){
            System.out.println(srcArray[i]);
        }
        System.out.println("输出目标数组");
        for (int j=0; j<destArray.length; j++){
            System.out.println(destArray[j]);
        }

        //currentTimeMillis() 方法
        //该方法的作用是返回当前的计算机时间，
        // 时间的格式为当前计算机时间与 GMT 时间（格林尼治时间）1970 年 1 月 1 日 0 时 0 分 0 秒所差的毫秒数
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        int i;
        long trem=0;
        for (i=0;i<100000000;i++){
            trem = trem+i;
        }
        System.out.println(trem);
        long endTime = System.currentTimeMillis();
        long soTime=endTime-startTime;
        System.out.println(soTime);


        // identityHashCode(Object x)与hashCode()方法返回相同的哈希值
        String  str1= "hello";
        String str2= "hello";
        System.out.println(str1.hashCode()+"--------"+str2.hashCode());
        System.out.println(System.identityHashCode(str1)+"-----"+System.identityHashCode(str2));


        String str3 =new String("Hello");
        String str4 = new String("Hello");
        //不同对象通过重写的hashCode()方法返回的值可能相同
        System.out.println(str3 .hashCode()+"------"+str4.hashCode());
        //因为str3和str4为两种不同的对象所以他们通过identityHashCode方法返回的内存地址不相同；
        System.out.println(System.identityHashCode(str3)+"-----"+System.identityHashCode(str4));

    }
}
