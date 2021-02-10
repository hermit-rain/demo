package com.google.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 描述了java的输入输出中的 字节输出流
 */

public class FileOutputStreamTest {


    public static void main(String[] args) {

        try (
                FileInputStream fis = new FileInputStream("C:\\Users\\hermi\\Desktop\\input_databases.txt");
                FileOutputStream fos = new FileOutputStream("C:\\Users\\hermi\\Desktop\\output.txt"))
        {
            byte [] bbuf = new byte[1024];
            int hasRead = 0;
            while((hasRead=fis.read(bbuf)) > 0){
                //每读取一次就写入文件输出流，读了多就写多少
                fos.write(bbuf,0,hasRead);
            }

        } catch (IOException ioe) {
            System.out.println("存在输入输出异常");
            ioe.printStackTrace();
        }

    }


}