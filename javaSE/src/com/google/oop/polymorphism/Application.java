package com.google.oop.polymorphism;


public class Application {

    public static void main(String[] args) {

        // 替父从军 (向上转型)
        HuaHu huaHu = new HuaMuLan();

        System.out.println(huaHu.name);
        System.out.println(huaHu.age);

        huaHu.sayMe();
        huaHu.fight();

        System.out.println("完仗遇到心爱的人================>");
        //大完仗遇到心爱的人  做回自己 （向下转型）
        HuaMuLan huaMuLan = (HuaMuLan) huaHu;

        System.out.println(huaMuLan.age);
        System.out.println(huaMuLan.name);
        huaMuLan.dressing();


    }
}
