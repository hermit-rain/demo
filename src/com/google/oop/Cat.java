package com.google.oop;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age, String variety, String food) {
        super(name, age, variety, food);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void barking() {
//        super.barking();
        System.out.println(this.getName()+"喵喵喵~");
    }
}
