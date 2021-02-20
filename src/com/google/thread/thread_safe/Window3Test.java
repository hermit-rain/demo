package com.google.thread.thread_safe;

/**
 * 练习--创建三个窗口卖票 ---使用 Runnable接口实现
 * 并通过同步方法解决线程安全问题
 *
 * 同步方法的总结
 * 1.同步方法仍然涉及到同步监视器，只是不需要显示的声明
 * 2.非静态的同步方法，同步器是 this
 * 3.静态的同步方法，同步器是 当前类本身
 *
 */

class Window3 implements Runnable {


    private int ticket = 100;

    @Override
    public  void run() {
        while (ticket != 0) {
            //调用同步方法
            show();
        }
    }


    /**
     * 创建同步方法
     * 注意：如果是通过extends继承类的方式创建同步方法需要用 static 修饰
     */
    public synchronized void show() {

        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖票，票号为" + ticket);
            ticket--;
        }
    }

}

public class Window3Test {

    public static void main(String[] args) {

        Window3 window3 = new Window3();

        Thread w1 = new Thread(window3);
        Thread w2 = new Thread(window3);
        Thread w3 = new Thread(window3);

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }


}
