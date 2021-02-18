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
        Dogs  zhangDog = new Dogs();

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

        //张大爷操作app
        zhangDog.sleep();


//        //注销账户
//        zhangDog = null;
//        //NullPointerException  原本zhangDog指针指向一些属性信息，现在指向了一片空的区域
//        System.out.println("zhangDog name is" + zhangDog.name);


        System.out.println("plot is " + Dogs.getPlotInstance());

        Dogs.injection();

        //通过单例模式创建对象
        Earth earthInstance = Earth.getEarthInstance();
        System.out.println(earthInstance);

    }
}
