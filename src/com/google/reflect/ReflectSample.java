package com.google.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectSample {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        Class rc = Class.forName("com.google.reflect.Robot");
        //创建对象实例
        Robot r = (Robot) rc.newInstance();
        System.out.println("Class name is" + rc.getName());
        //通过反射获取Robot类的私有方法
        //getDeclaredMethod() ==> 可以获取该类声明的方法(public private ...) 但是不能获取继承以及实现的方法
        Method getHello = rc.getDeclaredMethod("throwHello", String.class);
        //默认为false 只有设置为true才能调用私有方法
        getHello.setAccessible(true);
        //invoke() 默认返回 Object类型
        Object str = getHello.invoke(r, "Bob");
        System.out.println(str); //hello Bob
        //通过反射获取Robot类的公有方法
        //getMethod() ==> 获取该类的公有方法 同时包括继承和实现的方法
        Method sayHi = rc.getMethod("sayHi", String.class);
        sayHi.invoke(r, "welcome");
        //通过反射获取该类的私有类型的成员变量
        Field name = rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r,"Alice");
        sayHi.invoke(r, "welcome");

    }


}
