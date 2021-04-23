package com.google.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * 描述了java的字符输入流
 */

public class FileReaderTest {

    public static void main(String[] args){

        try(
                FileReader fr = new FileReader("C:\\Users\\hermi\\Desktop\\input_databases.txt"))
        {
            char [] cbuf = new char[32];
            int hasRead = 0;
            while ((hasRead = fr.read(cbuf)) > 0){
                System.out.println(new String(cbuf,0,hasRead));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
