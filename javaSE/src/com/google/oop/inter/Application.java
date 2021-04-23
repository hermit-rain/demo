package com.google.oop.inter;

public class Application {

    public static void main(String[] args) {


         //匿名内部类==>一般用在接口上
//        new HumanBehavior(){}
        HumanBehavior chinese = new HumanBehavior() {
            @Override
            public void eat() {
                System.out.println("中国人吃中餐");

            }

            @Override
            public void run() {
                System.out.println("中国人慢跑");

            }
        };
        chinese.eat();
        chinese.run();

    }


}
