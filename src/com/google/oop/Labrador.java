package com.google.oop;

/**
 * 拉布拉多
 *
 * 嵌套继承==> labrador extends Dog ,Dog extend Animal
 *  java 不支持多继承
 *  final  ==>  labrador已经在最下层 将没有其他子类继承它
 *  即用 final 修饰的类 不支持被继承
 *
 *  同时通过 final 修饰的方法也不可以重写
 *  子类可以使用但是不能重写（为所欲为）
 *
 *  final 修饰的变量一旦定义将不可被修改
 */

public final class Labrador extends Dog {


    @Override
    public boolean isGuideBlindness() {
//        return super.isGuideBlindness();
        return true;
    }
}
