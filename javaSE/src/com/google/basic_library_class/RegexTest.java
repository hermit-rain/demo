package com.google.basic_library_class;

import java.util.regex.Matcher;
import java.lang.IllegalStateException;

import java.util.regex.Pattern;

/**
 * 描述了java的正则表达式
 *
 * 正则表达式定义了字符串的模式，相当于构建了一个java字符串的自定义模板；
 *
 * java.util.regex 包主要包括以下两个类：
 * Pattern 类：
 * pattern 对象是一个正则表达式的编译表示
 * Pattern 类没有公共构造方法要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法
 * 它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数
 * Matcher 类：
 * Matcher 对象是对输入字符串进行解释和匹配操作的引擎
 * 与Pattern 类一样，Matcher 也没有公共构造方法
 * 需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象
 *
 * Matcher 类的方法
 * public int start()  返回以前匹配的初始索引
 * public int end() 返回最后匹配字符之后的偏移量
 * public boolean find()  尝试查找与该模式匹配的输入序列的下一个子序列
 *
 */

public class RegexTest {

    public static void main(String[] args){

        String str = new String("请尽快联系我17824852705,我的电话是15143385727出售二手书籍16824852705");
        // 创建一个pattern字符串模板
        Pattern pat = Pattern.compile("((17\\d)|(15\\d))\\d{8}");
        //调用Pattern类的matcher方法创建一个Matcher对象
        Matcher m =pat.matcher(str);
        //将给定字符串与模板字符串进行比较
        while (m.find()){
            //输出所有与模板字符串相匹配的字符串
            System.out.println(m.group());
        }

        //描述正则表达式的特殊字符
        Pattern pat2 =Pattern.compile("a*b");
        Matcher m2 = pat2.matcher("aab");
        boolean boo = m2.matches();
        System.out.println(boo);


        //Matcher类end()和start()方法
        String str2 =new String("java is very good ");
        System.out.println("目标字符串："+str2);
        Matcher m3 = Pattern.compile("\\w+").matcher(str2);
        while(m3.find()){
            System.out.println(m3.group()+"起始字符位置："+m3.start()+"结尾字符位置："+ m3.end());
        }


        //通过正则表达式输出字符串数组
        String[] mails = {"kongyeeku@163.com", "kongyeeku@gmail.com", "ligang@crazyit.org", "wawa@abc.xx"};
        String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";

        Pattern mailPattern =Pattern.compile(mailRegEx);

        //用for循环for（：）方法对数组进行遍历输出
        Matcher matcher =null;
        for(String mail :mails){
            if (matcher == null)
                //第一次匹配时创建matcher对象
                matcher = mailPattern.matcher(mail);
            //先重置目标字符串进行迭代下一个字符串相当于i++
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        }

        //使用下标法进行遍历
        for (int i=0;i<mails.length;i++){
            matcher =mailPattern.matcher(mails[i]);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }





    }

}
