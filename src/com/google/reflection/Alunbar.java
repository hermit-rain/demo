package com.google.reflection;

import java.lang.reflect.Modifier;

/**
 * 描述java反射
 * java反射可以在运行时无需知道类的名字、方法名等就可以检测类 接口 方法和变量等信息
 *
 * Class类
 * 检查一个类之前 必须获取到 java.lang.Class 对象
 * java提供两种方式获取到Class类
 * 1).class ==> 在编译的时候知道具体的类
 * 2).使用Class.forName() ==> 运行时动态的获取Class类 只需要将类名作为forName方法的参数即可
 *
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

        Class birdClass =  Bird.class;
        System.out.println(birdClass.getModifiers()); // 2 => private
        //获取Bird类的修饰符
        System.out.println(Modifier.isPublic(birdClass.getModifiers())); //false
        System.out.println(Modifier.isPrivate(birdClass.getModifiers())); //true

        //获取包信息
        System.out.println(birdClass.getPackage());



    }

    private class Bird{



    }




}
