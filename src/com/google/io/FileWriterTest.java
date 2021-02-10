package com.google.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 描述了java的字符输出流
 */

public class FileWriterTest {
    public static void main(String[] args){

        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\hermi\\Desktop\\fr.txt");
            fw.write("hello world\n");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw != null){
                try {
                    fw.close();
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }


        }

    }
}
