package com.google.basic_library_class;
/**
  main方法
 由于JVM在运行这个Java应用程序的时候，首先会调用main方法，
 调用时不实例化这个类的对象，而是通过类名直接调用因此需要是限制为public static
 main()方法定义必须是：“public static void main(String 字符串数组参数名[])”
 jvm有限制，不能有返回值，因此返回值类型为void

 * */

public class Main  {
    //主方法入口
    public static void main(String[] args){


    //输出args数组的长度
        System.out.println(args.length);
        System.out.println("打印main方法中的输出参数");

        for (int i=0;i<args.length;i++){
        System.out.println(args[i]);
    }

}



}
