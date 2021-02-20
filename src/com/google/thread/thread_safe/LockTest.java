package com.google.thread.thread_safe;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程同步安全问题 方式三 ==> look锁--JDK5.0
 *
 * =====synchronized 与 lock======
 *
 * 相同 :两者都可以解决线程的安全问题
 * 不同 :synchronized机制在执行完相应的同步代码后，自动的释放同步监视器
 *      lock 必须手动启动同步 lock()，同时结束同步也需要手动的释放unlock()
 * *
 */


class Window4 implements Runnable{

    private int ticket = 100;


    //1.实例化ReentrantLock
    private ReentrantLock lock = new ReentrantLock();


    @Override
    public void run() {

        while (true) {

            try {
                //2.调用look方法lock()
                lock.lock();

                if (ticket > 0) {

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "售票-票号为" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //3.调用解锁的方法unlock(
                lock.unlock();

            }
        }

    }
}


public class LockTest {

    public static void main(String[] args) {

        Window4 window = new Window4();

        Thread t1 = new Thread(window);
        Thread t2 = new Thread(window);
        Thread t3 = new Thread(window);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }




}
