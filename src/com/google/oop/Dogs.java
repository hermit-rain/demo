package com.google.oop;
/**
 * 类当中的变量和方法统称为属性（共性 + 特性）
 */
public class Dogs {

    /**
     * public 公有的
     * private私有的（不能让用户为所欲为）
     *  public String balance;
     *  AliPay rain = new AliPay();
     *  rain.balance = 9999999999999;
     */
    //成员变量 它们组成并构成了类
    //狗名字
    private String name;
    //狗种类
    private String variety;
    //狗年龄
    private int age;
    //狗的食物
    private String food;


    //定义小区的名字==>NanG
    //static 关键字  静态变量
    // 站在类的层面去考虑的 即 所有的狗都有一个共同的小区名字
    private static String  plot = "NanG";

    /**
     * 1.初始化
     * int[] arrDogs = {1,2,3,4};
     * 2.先定义后使用
     * int[] arrDogs = new int[4]
     * arrDogs[0] = 1;
     * ---
     * arrDogs[3] = 4;
     */
    //定义构造方法（函数）注： 不加类型
    //定义无参数构造器 默认的 但是一旦重新创建构造器就必须要写无参构造器
    public Dogs() {

    }
    //重新定义构造器==>初始化对象
    public Dogs(String name, String variety, int age, String food) {
        this.name = name;
        this.variety = variety;
        this.age = age;
        this.food = food;
    }
    //多个构造方法的本质 ===> 方法的重载
    public Dogs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * oop--封装
     * 我们通过定义set get方法给用户一个可以设置并获取的功能
     * 但是仍然不可以随便搞-有一定的条件限制
     * getter and setter 快捷键 ===> alt + enter 或者安装lombok直接在类上@
     */
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
        //狗年龄限制
        if (age < 0 || age > 100) {
            System.out.println("您输入的数据不合法已经清零");
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    //静态变量的获取
    public static String getPlotInstance() {
        return plot;
    }



    //一个动作，这些方法（函数）--有逼格的名字-行为
    //狗吃饭
    void eat() {
        //this 指调用的对象
        System.out.println(this.name+"狗吃饭");
    }
    //狗睡觉
    void sleep() {
        System.out.println(this.name+"狗睡觉");
    }
    //狗生病
    void sick() {
        System.out.println(this.name+"狗生病");
    }

    public static void injection() {
        System.out.println("所有的狗月底打针");
    }

    /**
     * 重写 toString方法
     *  未重写toString方法单独输出对象即为指针信息
     *  //zhangDog = com.google.oop.Dogs@312b1dae
     *  System.out.println("zhangDog = " + zhangDog);
     */
    @Override
    public String toString() {
        return "Dogs{" +
                "name='" + name + '\'' +
                ", variety='" + variety + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                '}';
    }
}
