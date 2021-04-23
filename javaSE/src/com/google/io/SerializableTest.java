package com.google.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

/**
 * 描述了java的序列化机制
 */

public class SerializableTest {
    public static void main(String[] args){

        ObjectOutputStream oos = null;
        try {

            oos = new ObjectOutputStream(new FileOutputStream(".\\object.txt"));
            Person per = new Person("caixinyu",18);
            oos.writeObject(per);

        }catch (Exception ioe){
            ioe.printStackTrace();
        }finally {
            if(oos!=null){
                try {
                    oos.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

    }
    /**
     * 自定义一个Person类实现Serializable接口
     */

    public static class Person implements java.io.Serializable{
        private String name;
        private int age;
        //定义有参数的构造器
        public Person(String name ,int age){
            this.name = name;
            this.age = age;
        }


        }




}

