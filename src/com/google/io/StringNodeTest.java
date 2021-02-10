package com.google.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * 描述了java的访问字符串的输入输出流字符流
 * 包括 StringReader 和 StringWriter
 *
 */

public class StringNodeTest {

    public static void main(String[] args){

        String str = "hello java\n"
                +"hello world\n"
                +"good good study\n"
                +"day day up\n";
        char[] cbuf = new char[32];
        int hasRead = 0;
        try (
                StringReader sr = new StringReader("src") )
        {
            while((hasRead= sr.read(cbuf)) > 0){
                System.out.println(new String(cbuf,0,hasRead));
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        try(
                StringWriter sw = new StringWriter() )
        {
            sw.write("有一个美丽的世界");
            sw.write("她还在等着我");

            System.out.println("打印通过字符访问的输入流输入的字符串为：");
            System.out.println(sw.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
