package com.google.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * 描述java反射
 * <p>
 * 反射机制是在运行状态中，对任意的一个类，都能够知道这个类的所有属性和方法
 * 对于任意一个对象，都能够调用它的任意书方法和属性
 * 这种动态获取信息以及动态调用对象方法的功能称为java语言的反射机制
 * <p>
 * Class类
 * 检查一个类之前 必须获取到 java.lang.Class 对象
 * java提供两种方式获取到Class类
 * 1).class ==> 在编译的时候知道具体的类
 * 2).使用Class.forName() ==> 运行时动态的获取Class类 只需要将类名作为forName方法的参数即可
 */

public class Alunbar {

    public static void main(String[] args) {


        Class alunbarClass = Alunbar.class;
        //获取类名包含包信息
        System.out.println(alunbarClass.getName());
        //获取类名不包含包信息
        System.out.println(alunbarClass.getSimpleName());

        //获取Alunbar类的修饰符
        System.out.println(alunbarClass.getModifiers()); // 1 => public
        System.out.println(Modifier.isPublic(alunbarClass.getModifiers())); //true
        System.out.println(Modifier.isAbstract(alunbarClass.getModifiers())); //false

        Class birdClass = Bird.class;
        System.out.println(birdClass.getModifiers()); // 2 => private
        //获取Bird类的修饰符
        System.out.println(Modifier.isPublic(birdClass.getModifiers())); //false
        System.out.println(Modifier.isPrivate(birdClass.getModifiers())); //true

        //获取包信息
        System.out.println(birdClass.getPackage()); //package com.google.reflection

        //获取Bird父类的Class对象
        //getSuperclass() ==> 返回父类的Class对象
        Class superClass = birdClass.getSuperclass();
        System.out.println(superClass.getSimpleName()); //Animal

        //获取接口信息
        //getInterfaces() ==> 返回指定类实现的接口 并不返父类实现的接口
        Class[] interfaces = birdClass.getInterfaces();
        System.out.println(Arrays.toString(interfaces)); // []


        //获取构造参数Constructor
        //getConstructors() ==> 返回所有声明的用public修饰的构造函数
        Constructor[] constructors = birdClass.getConstructors();
        //[public com.google.reflection.Alunbar$Bird(com.google.reflection.Alunbar), public com.google.reflection.Alunbar$Bird(com.google.reflection.Alunbar,java.lang.String,int)]
        System.out.println(Arrays.toString(constructors));

    }

    private class Bird extends Animals {

        private String name; //鸟名字
        private int age; //鸟年龄

        //定义构造器
        public Bird() {

        }

        public Bird(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    private class Animals {

    }


}
