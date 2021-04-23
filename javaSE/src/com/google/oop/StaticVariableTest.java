package com.google.oop;

/**
 * 描述如何在 main() 方法中调用本类的静态和非静态方法
 * 在 main() 方法中只能直接调用静态方法
 * 如果想调用非静态方法，需要将当前类实例化，然后通过类的对象来调用
 *
 */
public class StaticVariableTest {

    public static void main(String[] args) {
        // Speak1();    // 错误调用
        Speak2();    // 可以直接调用静态方法Speak2()
        StaticVariableTest t = new StaticVariableTest();
        t.Speak1();    // 调用非静态方法，需要通过类的对象来调用
    }


    //创建非静态方法
    public void Speak1() {
        System.out.println("你好!");
    }
    //创建静态方法
    public static void Speak2() {
        System.out.println("Java!");
    }
}