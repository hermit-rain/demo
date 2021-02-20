package com.google.thread.thread_safe;

/**
 * 练习--创建三个窗口卖票 ---使用extends继承方式
 * 并通过同步代码块解决线程安全问题
 */

class Window extends Thread {

    //通过static确保多个线程共用一个数据
    private static int ticket = 100;
    //extends的创建的对象必须是static的
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            //此处的锁不能用 this===>此时的this代表 w1,w2,w3
            //可以用 Window.class==>反射-类实际也可作为对象
            synchronized (obj) {
                if (ticket > 0) {
                    System.out.println(getName() + "卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }

        }
    }
}

public class WindowTest {

    public static void main(String[] args) {

        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }


}
