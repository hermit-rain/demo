package com.google;

import java.io.*;

/**
 * 描述了java的异常处理中的try块
 *
 * 包括java 7的try以及java 9 的增强功能
 *
 * 主要表示java的异常处理try块不在依赖于finally块来进行物理资源的关闭
 * 对于自动关闭资源的try语句， 可以没有catch和finally——try块可以单独存在
 * 如果程序需要，自动关闭资源的try语句后也可以带多个catch块和一个finally块
 * 只有放在try后面的圆括号里的资源才会被关闭。
 * 能被自动关闭的资源必须实现Closeable或AutoCloseable接口
 */

public class TryExceptionTest {

    public static void main(String [] args)throws IOException {

        //java 7 的try块处理资源回收的部分
        try (
                // 声明、初始化两个可关闭的资源 try语句会自动关闭这两个资源
                BufferedReader br = new BufferedReader(new FileReader("hello.java"));
                PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));
                )
        {
            System.out.println(br.readLine());
            ps.println("hello java");

        }

        //java 9新增了java的try块的功能
        final BufferedReader br = new BufferedReader(new FileReader("AutoCloseTest2.java"));
        //没有显式使用final修饰,但只要不对该变量重新赋值,该变量就是有效的final
        PrintStream ps = new PrintStream(new FileOutputStream("a.txt"));
        // 只要将两个资源放在try后的圆括号内即可
        try (br;ps){
            // 使用两个资源
            System.out.println(br.readLine());
            ps.println("庄生晓梦迷蝴蝶");
        }

    }

}
