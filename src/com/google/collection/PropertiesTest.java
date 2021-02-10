package com.google.collection;

import java.io.*;
import java.util.Properties;

/**
 * 描述了java Map集合中的Properties集合
 *
 * Properties类是Hashtable的子类，它可以把Map对象和属性文件关联起来
 * 从而可以把Map对象中的key-value对写入属性文件
 * 也可以把属性文件中的属性名=属性值加载到Map对象中
 * 由于属性文件里的属性名、属性值只能是字符串类型，所以Properties里的key、value都是字符串类型
 */

public class PropertiesTest {

    public static void main(String[] args) throws IOException {

        Properties pro = new Properties();
        pro.setProperty("username","hermit");
        pro.setProperty("password","123456");

       System.out.println(pro);

       //将Properties中的key-value对保存到a.ini文件中
//       pro.store(new FileOutputStream("d:\\a.ini"),"comment line");

        Properties prop = new Properties();
        prop.setProperty("tel","17824852705");

        //将a.ini文件中的key-value对追加到props2中
//        prop.load(new FileInputStream("d:\\a.ini"));
        System.out.println(prop);


    }

}
