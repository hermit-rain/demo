package com.google.oop;
/**
 * 对象的实例的区别
 * 实例：现实当中的东西（活生生的事物，唯一的）对抽象的事物的一种表示，
 * 对抽象的东西具体化
 * 对象可能要大于实例
 */

public class Application {
    public static void main(String[] args) {
        //张大爷注册了该app 创建了一个账户
        //对象 --实例
        Dog  zhangDog = new Dog();

        //设置狗的信息
//        //封装之后就无法直接设置
//        zhangDog.name = "jerry";
//        zhangDog.age = 2;
//        zhangDog.variety = "拉布拉多";

        zhangDog.setName("jerry");
        zhangDog.setAge(2);
        zhangDog.setVariety("拉布拉多");
        zhangDog.setFood("火腿");

        //王阿姨注册
        Dogs wangDogs = new Dogs("Tom","藏獒",2,"小鱼干");

        //李阿姨注册
        Cat liCat = new Cat();

        liCat.setName("tom");
        liCat.setAge(3);
        liCat.setFood("猫粮");
        liCat.setVariety("加菲猫");

//        //通过构造方法创建对象
//        Cat wangCat = new Cat("duck",1,"波斯","猫粮");

        Labrador seven = new Labrador();
        System.out.println(seven.isGuideBlindness());


        //操作app
        zhangDog.eat();
        liCat.eat();

        zhangDog.barking();
        liCat.barking();


//        //注销账户
//        zhangDog = null;
//        //NullPointerException  原本zhangDog指针指向一些属性信息，现在指向了一片空的区域
//        System.out.println("zhangDog name is" + zhangDog.name);

//        //测试静态变量static
//        System.out.println("plot is " + Dogs.getPlotInstance());
//        Dogs.injection();


    }
}
