package com.google.basic_library_class;

import java.math.BigDecimal;

/**
 * 描述了BigDecimal类
 * 　float和double类型的主要设计目标是为了科学计算和工程计算
 *  因在于我们的计算机是二进制的 浮点数没有办法是用二进制进行精确表示
 *  商业计算往往要求结果精确，这时候BigDecimal就派上大用场
 *
 *  BigDecimal类的常用构造方法
 *
 * 1.public BigDecimal(double val)    将double表示形式转换为BigDecimal 不建议使用
 * 2.public BigDecimal(int val)　　将int表示形式转换成BigDecimal
 * 3.public BigDecimal(String val)　　将String表示形式转换成BigDecimal
 * 注意：参数类型为double的构造方法的结果有一定的不可预知性 String 构造方法是完全可预知的
 * 所以BigDecimal类最好使用String类的构造器；
 *
 * BigDecimal类的常用方法
 * public BigDecimal add(BigDecimal value);                加法
 * public BigDecimal subtract(BigDecimal value);           减法
 * public BigDecimal multiply(BigDecimal value);           乘法
 * public BigDecimal divide(BigDecimal value);             除法
 *
 */

public class BigDecimalTest {

    public static void main(String[] args){

        //BigDecimal类的基础对象的构建
        BigDecimal doubleTest1 = new BigDecimal("0.01");
        BigDecimal doubleTest2 = new BigDecimal(0.01);
        BigDecimal intTest1 = new BigDecimal(178);
        //string 的构造器是完全预知的所以可以精确的表示0.01
        System.out.println(doubleTest1);
        //0.01无法精确的表示double所以系统会默认随机补位
        System.out.println(doubleTest2);
        System.out.println(intTest1);


        //BigDecimal类的基础方法的使用
        BigDecimal testNumber1 = new BigDecimal("0.15");
        BigDecimal testNumber2 = new BigDecimal("0.03");
        System.out.println(testNumber1.add(testNumber2));
        System.out.println(testNumber1.subtract(testNumber2));
        System.out.println(testNumber1.multiply(testNumber2));
        System.out.println(testNumber1.divide(testNumber2));

    }

}

