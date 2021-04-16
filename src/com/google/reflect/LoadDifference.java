package com.google.reflect;

/**
 *
 * 类加载的方式
 * 隐式加载：使用 new + 构造方法时，隐式的调用类加载器，加载对应的类到 JVM 中，是最常见的类加载方式
 * 显式加载：使用 loadClass()、forName() 等方法显式的加载需要的类
 * 对于显式加载这种类加载方式来讲，当我们获取到了 Class 对象后，需要调用 Class 对象的 newInstance() 方法来生成对象的实例
 *
 * loadClass 与 forName 的区别
 * Class.forName ==> 除了将类的.class文件加载到jvm中之外，还会对类进行解释，执行类中的static块。
 * classloader ==> 只干一件事情，就是将.class文件加载到jvm中，不会执行static中的内容，只有在newInstance才会去执行static块。
 *
 */

public class LoadDifference {


    public static void main(String[] args) throws ClassNotFoundException {

        //ClassLoader cl = Robot.class.getClassLoader();
        Class r = Class.forName("com.google.reflect.Robot");

    }

}
