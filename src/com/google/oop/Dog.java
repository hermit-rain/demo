package com.google.oop;

/**
 * 继承 子类继承父类
 */

public class Dog extends Animal{


    //  继承并不能继承父类的构造方法
    public Dog() {
    }

    public Dog(String name, int age, String variety, String food) {
        //通过super强制使用父类的构造方法
        super(name, age, variety, food);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    /**
     * 重写 Override
     * 从父类革新 子类打破传统进行革新拥有自己的特性
     * 革新的内容即为方法体
     */
    @Override
    public void barking() {
//        //超级 啃老
//        super.barking();
        System.out.println(this.getName()+"汪汪汪~");
    }


    /**
     * 导盲
     * @return
     */
    public boolean isGuideBlindness() {
        //默认不能导盲
        return false;
    }




}
