package com.google.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 描述了java的处理流之一  装换流
 * InputStreamReader 将字符流转换成字符流
 *
 * System.in和System.out分别代表系统标准的输入和输出设备
 */

public class InputStreamReaderTest {
    public static void main(String[] args){

        try (
                //通过System.in创建一个输入字节流文件然后通过InputStreamReader将字节流转化成字符流
                InputStreamReader reader = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(reader)    )
        {
            String line = null;
            while((line = br.readLine())!=null){
               if(line.equals("exit")){
                   System.exit(1);
               }
               //打印输入的内容
               System.out.println("输入的内容为："+line);
            }


        }catch (IOException ioe){
            ioe.printStackTrace();
        }



    }
}
