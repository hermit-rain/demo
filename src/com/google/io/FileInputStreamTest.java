package com.google.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 描述了java的字节输入流
 */

public class FileInputStreamTest {
    public static void main(String [] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\hermi\\Desktop\\input_databases.txt");

        //创建一个byte字节的竹筒来取水
        byte [] buf = new  byte[1024];
        //定义一个每次读取的字节数--竹筒一次的取水起始字节数
        int hasRead = 0;
        while ((hasRead = fis.read(buf)) > 0){
            System.out.println(new String(buf,0,hasRead));
        }
        fis.close();


    }
}
