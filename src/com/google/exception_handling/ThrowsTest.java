package com.google.exception_handling;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 描述了java的异常处理机制中finally关键字
 *
 * 当前方法不知道应该如何处理这种类型的异常，该异常应该由上一级调用者处理
 * 如果main方法也不知道应该如何处理这种类型的异常，也可以使用throws声明抛出异常，该异常将交给JVM处理
 *
 * throws声明抛出只能在方法签名中使用，throws可以声明抛出多个异常类，多个异常类之间以逗号隔开
 */


public class ThrowsTest {
    public static void main(String[] args)throws IOException {

        /**
         * 因为test()声明抛出IOException异常,所以调用test()方法的代码要么处于try...catch块中,
         * 要么处于另一个带throws声明抛出的方法中
         */
        test();

    }
    public static void test() throws IOException {

        /**
         * 因为FileInputStream的构造器声明抛出IOException异常
         * 所以调用FileInputStream的代码要么处于try...catch块中,要么处于另一个带throws声明抛出的方法中
         */

        FileInputStream file = new FileInputStream("a.txt");

    }
}

