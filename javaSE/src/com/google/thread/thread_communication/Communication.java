package com.google.thread.thread_communication;

/**
 * 描述线程间通信
 *
 * 使用两个线程打印 1 - 100 要求 两个线程交替打印
 *
 * 线程通信涉及的方法
 * 1.wait() 一旦执行此方法当前线程就进入阻塞状态，并释放同步监视器
 * 2.notify()   唤醒被 wait 的线程，如果有多个线程被 wait,就根据优先级唤醒其中一个
 * 3.notifyAll()   唤醒多有被 wait 的线程
 *
 * 说明
 * 1.用 wait() notify() notifyAll() 三个方法执行线程通信时必须使用在同步代码块或同步方法中
 * 2.wait() notify() notifyAll() 三个方法的调用者必须是 同步代码块或者同步方法的 同步监视器
 * 3.wait() notify() notifyAll() 都定义在 java.lang.Object中
 *
 * 面试 sleep() && wait() 异同
 * 相同： 一旦执行都可以使当前线程进入阻塞状态
 * 不同：1)两个方法的声明的位置不同 Thread类 声明 sleep(), Object类声明 wait()
 *      2)调用的要求不同：sleep() 可以在任何需求的场景下调用 wait() 必须使用在同步代码块或者同步方法中
 *      3)关于是否释放同步监视器： 如果两个方法都使用在同步代码块或者同步方法中 sleep()不会释放锁，wait()会释放锁
 */


class Number implements Runnable {

    private int number = 1;

    @Override
    public void run() {

        while (true) {

            synchronized (this) {

                //notify()解除当前正在阻塞的线程
                notify();
//                obj.notify()

                if (number <= 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        //wait()使用如下调用wait()的线程阻塞 并释放锁
                        //单独用wait并不会释放锁====> 线程1:1 线程2:2 之后都阻塞
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    break;
                }
            }
        }
    }
}

public class Communication {

    public static void main(String[] args) {

        Number number = new Number();

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);

        t1.setName("线程1");
        t2.setName("线程2");


        t1.start();
        t2.start();

    }


}
