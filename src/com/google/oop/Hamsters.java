package com.google.oop;

/**
 * 仓鼠
 * 抽象 ==> 具体的概括和解释具体的事物
 *
 * 父类 Animal 是抽象的 本质是不应该去 new  没有意义
 * 抽象类不能 new
 * Animal animal = new Animal();  无意义
 *
 * abstract 抽象类 关键字
 * 子类继承的>抽象类的抽象方法必须重写 ===> 同时防止落写
 *
 */

public class Hamsters extends Animal{

    @Override
    public void barking() {
        System.out.println(this.getName() + "唧唧即");

    }

    public static void main(String[] args) {

        //抽象 --- 具体
        //动物 --- 仓鼠
        Hamsters hamsters = new Hamsters();

        hamsters.barking();

    }


}
