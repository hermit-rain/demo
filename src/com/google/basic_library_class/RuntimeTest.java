package com.google.basic_library_class;

import java.io.IOException;

/**
 * 描述了Runtime类
 * Runtime类描述Java程序的运行时环境
 * 每个Java程序都有一个与之对应的Runtime实例
 * 该类会被自动创建，我们可以通过Runtime.getRuntime() 方法来获取当前程序的Runtime实例。
 * 应用程序通过该对象与其运行的环境相连接 可以访问JVM的相关信息，如处理器数量、内存信息等
 *
 * 几种常见的Runtime方法
 * public static Runtime getRuntime（）： 此方法返回与当前Java应用程序关联的实例或Runtime对象。
 * public long freeMemory（）：此方法返回JVM（Java虚拟机）中的可用内存量
 * public long totalMemory（）：此方法返回JVM（Java虚拟机）中的总内存量
 * public long maxMemory（）：此方法返回Java虚拟机将尝试使用的最大内存量
 *
 * public Process exec（String command）抛出IOException：此方法在单独的进程中执行给定的命令
 *
 * public void gc（）：此方法运行垃圾收集器
 * 调用此方法表明Java虚拟机花费了大量精力来回收未使用的对象，以使其当前占用的内存可用于快速重用
 */



public class RuntimeTest {
    public static void main (String[] args) throws IOException {
        //创建一个实例化对象
        Runtime run = Runtime.getRuntime();
        //调用Runtime中的方法获取jvm的相关信息
        System.out.println("jvm中可用的内存数："+run.freeMemory());
        System.out.println("jvm中总内存数："+run.totalMemory());
        System.out.println("jvm尝试使用最大的内存数："+run.maxMemory());

        //通过exec方放来调用jvm单独启用一个进程来执行操作命令
        run.exec("notepad.exe");

        //调用Runtime中gc()方法进行垃圾回收
        run.gc();
    }

}
