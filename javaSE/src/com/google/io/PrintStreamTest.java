package com.google.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 描述了java的io中通过PrintStream 将节点流处理成处理流
 * 通常只需要在创建处理流时传入一个节点流作为构造器参数即可
 * 这样创建的处理流就是包装了该节点流的处理流
 *
 * 在输出流中可以包含同名的文件夹也可以没有文件夹并且新的输出流会对原始的数据进行重新覆盖
 * 但是在输入流中必须要有输入的文件夹
 */

public class PrintStreamTest {
    public static void main(String [] args){

        try(
            FileOutputStream fos = new FileOutputStream("C:\\Users\\hermi\\Desktop\\input_databases.txt");
            PrintStream ps = new PrintStream(fos))
        {
            //使用PrintStream进行输出
            ps.println("hello world");
            ps.println(new PrintStreamTest());

        }catch (IOException e){
            e.printStackTrace();
        }




    }
}
