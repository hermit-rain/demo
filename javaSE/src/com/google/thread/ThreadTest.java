package com.google.thread;

/**
 * 多线程的创建方式一： 继承于Thread类
 *
 * 1.创建一个继承于Thread类的子类
 * 2.重写 Thread类的 run()方法 ==> 将此线程需要执行的操作声明在 run()中
 * 3.创建Thread类的子类的对象 ==> 主线程
 * 4.通过此对象调用start()方法
 *
 * 例:遍历100以内的偶数
 *
 */
//1.创建一个Thread类的子类
class MyThread extends Thread {

    //2.重写Thread类的run()
    @Override
    public void run() {
//        super.run();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}


public class ThreadTest {


    public static void main(String[] args) {

        //3.创建Thread类的子类对象
        MyThread t1 = new MyThread();
        //4.通过此对象调用start()====> (1).启动当前线程(2).调用当前线程的run()
        t1.start();

//        //问题一：我们不能只通过run()去创建线程
//        //只是调用run()而不调用start()相当于在主线程中创建对象并调用方法
//        t1.run();

        //如下操作在main线程中执行
        //此时主线程与子线程交替执行 同时抢占cpu资源
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println("main========>hello world");
            }
        }

//        //问题二：再创建一个线程，不可以用当前对象来start(); 报IllegalThreadStateException
//        t1.start();
        //创建线程要创建多对象
        MyThread t2 = new MyThread();
        t2.start();

    }



}
