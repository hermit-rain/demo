package com.google.basic_library_class;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 描述了java异常的finally()关键字
 *
 * finally()
 * 程序在try块里打开了一些物理资源（例如数据库连接、网络连接和磁盘文件等），这些物理资源都必须显式回收
 * 然而java的垃圾回收机制只能回收堆内存中的东西，并不能进行回收物理资源
 * 所以对于物理资源我们必须用finally()方法进行回收
 */

public class FinallyTest {
    public static void main(String[] args){
        System.out.println("描述了java异常的finally关键字");
        //创建一个空的文件对象
        FileInputStream file = null;
        try {
            file = new FileInputStream("a.txt");
        }catch (IOException e) {
            System.out.println(e.getMessage());
            //打印跟踪栈信息
            e.printStackTrace();
            //强制关闭虚拟机-执行次语句finally块中的语句将不会在执行
//            System.exit(1);
            return;
        }finally {
            if(file != null){
                try {
                    //关闭磁盘回收资源
                    file.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }
            System.out.println("执行finally块里的资源回收");
        }




    }



}
