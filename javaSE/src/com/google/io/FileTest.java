package com.google.io;

import java.io.File;
import java.io.IOException;

/**
 *  描述了java的输入和输出的File类
 */

public class FileTest {

    public static void main(String[] args) throws IOException {

        //以当前路径来创建一个file对象
        File file = new File(".");
        //直接获取文件名字
        System.out.println(file.getName());
        //获取文件相对路径的父路径
        System.out.println(file.getParent());
        //获取绝对路径
        System.out.println(file.getAbsolutePath());
        //获取上一级路径
        System.out.println(file.getAbsoluteFile().getParent());
        //在当前路径上创建一个临时文件
        File fileTest = File.createTempFile("aaa", ".txt", file);
        //当java jvm 退出时删除文件
        fileTest.deleteOnExit();
        //以当前的系统时间为对象名来创建一个File对象
        File newFile = new File(System.currentTimeMillis()+"");
        //文件并不存在所起输出false
        System.out.println(newFile.exists());
        //创建文件
        newFile.createNewFile();
        System.out.println(newFile.exists());
        //此时此刻当前文件夹已经包含同名的文件所以我们不会在创建文件夹
        newFile.mkdirs();
        //通过list方法来获取当前路径下的所有文件和路径
        String [] fileList = file.list();
        System.out.println("当前路径下的所有文件名为：");
        for (String fileString : fileList){
            System.out.println(fileString);
        }
        //通过listRoots()静态方法来列出所有词磁盘跟路径
        File [] roots = file.listRoots();
        System.out.println("=== 系统的所有跟根路径如下 ===");
        for ( File root :roots ){
            System.out.println(root);
        }

        /**
         * 文件过滤器
         * 在File的list方法中可以接受一个FilenameFilter参数，通过该参数可以只列出符合条件的文件
         * accept(File dir, String name)方法 将对所有的子文件和和子目录进行迭代
         */

        //使用Lambda表达式来实现过滤的功能
        //选出以.java结尾或者文件对应一个路径的文件夹
        String [] nameList = file.list((dir,name) -> name.endsWith(". java") || new File(name).isDirectory());
        for (String name : nameList){
            System.out.println(name);
        }

    }

}