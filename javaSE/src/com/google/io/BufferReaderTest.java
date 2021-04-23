package com.google.io;

import java.io.*;

/**
 * 描述了java的输入输出中的缓冲流
 * 分为缓冲输入流和缓冲输出流
 */

public class BufferReaderTest {
    public static void main(String[] args){

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br  = new BufferedReader(new FileReader("C:\\Users\\hermi\\Desktop\\input.txt"));
            bw = new BufferedWriter(new FileWriter("C:\\Users\\hermi\\Desktop\\input_databases.txt"));
            String str = null;
            // 每次读取文本文件的一行字符串并输出
            while ((str=br.readLine())!=null){
                bw.write(str);
                //写入行分隔符
                bw.newLine();
            }
            //刷新缓冲区
            bw.flush();

        }catch (IOException ioe){
            ioe.printStackTrace();
        }finally {
            //关闭IO流对象
            if(bw!=null){
                try {
                    bw.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            if(br!=null){
                try {
                    br.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }


        }

    }
}
