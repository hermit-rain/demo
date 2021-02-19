package com.google.oop.inter;


public class Westerner implements HumanBehavior {
    @Override
    public void eat() {
        System.out.println("西方人吃西餐");
    }

    @Override
    public void run() {
        System.out.println("大步跑");

    }
}
