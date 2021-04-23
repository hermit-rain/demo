package com.google.thread.thread_safe;


/**
 * 练习--创建三个窗口卖票 ---使用 Runnable接口方式
 *
 * =========卖票的过程中出现了重票和错票的问题=========
 *
 * 问题分析：当某个线程操作车票的过程中，尚未操作完成，其他的线程参与进来
 * 问题解决： 当一个线程a操作 ticket的时候其他的线程不用操作进来，直到线程a操作完ticket
 * 其他的线程才允许操作ticket，即使线程 a 阻塞也不允许改变
 *
 * 在java中我们通过同步机制来解决线程的同步问题
 *
 * 方式一 ： 同步代码块
 *  synchronized(同步监视器){
 *     //需要同步的代码
 *  }
 * 说明
 * 1.操作共享数据的代码即为同步的代码
 * 2.共享数据==>多个线程共同操作的数据 例如 ticket
 * 3.同步监视器 俗称==> 锁 任何一个对象都可以充当锁  要求：多个线程必须共用同一把锁
 * 4.在实现Runnable接口创建的多线程中可以考虑使用 this做同步监视器
 *
 * 方式二 ： 同步方法
 * 如果共享数据的代码完整的声明在一个方法中，我们不妨将此方法声明同步的
 *
 * 线程的同步解决了线程的安全问题 -好处
 * 操作同步代码时，只能有一个线程参与，其他的线程等待，相当于是一个单线程的过程--局限
 *
 */


class Window2 implements Runnable {


    //因为只通过一个对象创建的分线程==>不用 static
    private int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
//        //将同步监视器创建到run()有问题==>因为多个线程没有共用同一把锁
//        Object obj = new Object();
        while (true) {
//            synchronized (this) 此时的this：唯一的window2的对象==>所以也可以
            synchronized (obj) {
                if (ticket > 0) {
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class Window2Test {

    public static void main(String[] args) {

        Window2 window2 = new Window2();

        Thread w1 = new Thread(window2);
        Thread w2 = new Thread(window2);
        Thread w3 = new Thread(window2);

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();


    }


}
