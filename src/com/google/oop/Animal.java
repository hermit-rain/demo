package com.google.oop;


public abstract class Animal {

    //名字
    private String name;
    //种类
    private String variety;
    //年龄
    private int age;
    //食物
    private String food;
    //小区名
    private static String  PLOT = "NanG";

    //定义构造器
    public Animal() {

    }
    public Animal(String name, int age, String variety, String food) {
        this.name = name;
        this.variety = variety;
        this.age = age;
        this.food = food;
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //行为
    void eat() {
        System.out.println(this.name+"正在吃饭");
    }
    void sleep() {
        System.out.println(this.name+"正在睡觉");
    }
    void sick() {
        System.out.println(this.name+"生病");
    }

    /**
     * 抽象方法————没有实际意义 动物叫？？？
     * 抽象方法没有方法体
     * 只有抽象类才能有抽象方法
     */
    public abstract void barking();


    /**
     * 静态方法
     */
    public static void injection() {
        System.out.println("月底打针");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", variety='" + variety + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    //静态变量的获取
    public static String getPlotInstance() {
        return PLOT;
    }

}
