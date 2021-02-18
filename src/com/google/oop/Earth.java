package com.google.oop;

/**
 * 单例设计模式
 * 我们提供一个创建对象的方法，不允许 new 多个对象
 * 例如：地球只允许有一个不允许用户new多个出来
 */

public class Earth {
    private static Earth earthInstance = new Earth();

    private Earth() {

    }

    public static Earth getEarthInstance() {
        return earthInstance;
    }

}
