package com.google.oop.inter;

/**
 * 接口
 * 所有的方法都是抽象的===>没有方法体
 * 所有实现该接口的类都需要重写所有的方法
 *
 * ==接口与抽象类====哲学
 *
 * 接口可以 new 抽象类不可以 new
 *
 * Animal 抽象类 ==> 对具体的事物根源进行抽象  eg 对猫 狗 仓鼠 进行抽象
 *
 * Human 接口 ===> 对具体的行为或动作进行抽象  eg 对人类的 吃 跑动作进行抽象
 */

public interface HumanBehavior {


    public void eat();

    public void run();

}
