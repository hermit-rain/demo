package com.google.basic_library_class;

//引入scanner类库的jar包
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Scanner类的使用
 * 包括scanner的字符输入和文件输入的两种形式
 * 表明scanner类中next以及nextLine方法的区别
 * next无法读取空格 遇到空格即停止编译  nextLine可以识别空格并成功输出
 * scanner类中主要方法next ，hasNext 方法
 * hasNext hasNextLine作为判断判否还有下一行输入
 * next   nextLine 返回输入源中的下一行字符串
 * 注意：Scanner类只能返回String类的对象 不能返回StringBuffer类的对象
*/


public class ScannerTest {
    public static void main(String[] args) throws FileNotFoundException {
        //Scanner可以获取任何基本类型的
        Scanner scan = new Scanner(System.in) ;


        //Scanner可以获取文件输入 pathname 中表示文件的位置分为绝对位置和相对位置
//        Scanner sc = new Scanner(new File("src/com.google/Dogs.java"));

//        if (sc.hasNextLine()){
//            String str3 = sc.nextLine();
//            System.out.println("输入文件："+str3);
//       }


        //next方式接受字符串
        //用next返回输入源中的下一行字符串
        if (scan.hasNext()){
            String str1 =scan.next();
            System.out.println("输出的数据是："+str1);
        }
        //用 nextLine返回输入源中的下一行字符串
        if (scan.hasNextLine()){
            String str2 = scan.nextLine();
            System.out.println("输入字符串str2："+str2);

        }

        scan.close();
    }
}