package com.google.basic_library_class;


/**
 * 描述了math类
 * Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数
 * Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用
 * 还提供了两个静态变量：PI和E，值分别为：π和e
 */
public class MathTest {

    public static void main(String[] args){
        int a, b;
        a=9;
        b=-10;
        System.out.println(Math.abs(b));
        //计算乘方
        System.out.println(Math.pow(a,b));
        //计算自然对数
        System.out.println(Math.log(a));
        //找出最大值
        System.out.println(Math.max(7,12));

        //输出90度的正弦值
        //调用Math中的静态变量PI
        System.out.println("90度的正弦值为："+Math.sin(Math.PI/2));

    }
}
