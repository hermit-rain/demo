package com.google.thread;

/**
 * Thread类的常用方法
 * 1.start() 启动当前线程；调用当前线程的run()
 * 2.run() 通常需要重写Thread类的此方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread() 静态方法，返回执行当前代码的线程
 * 4.getName() 获取当前线程的名字
 * 5.setName() 设置当前线程的名字
 * 6.yield() 释放当前线程cpu的执行权==>很可能下一刻该线程又抢到cpu执行权
 * 7.join() 在某个程序执行流程中调用其他线程的join()时，当前线程将会被阻塞，直到调用的线程执行完毕为止===>（强插）
 * 8.stop() ==已经过时== 将执行此方法时，强制结束当前线程
 * 9.sleep(long millitime) 让当前线程睡眠指定 "millitime"时间，此时该线程处于阻塞状态
 * 10.isAlive() 判断当前线程是否存活
 *
 * 线程的优先级
 * 注意：高优先级的线程要抢占低优先级线程的cup执行权
 * 只是概率上高优先级的线程有更高的概率被执行，并不意味着只有在高优先级的线程执行完后低线程的线程才执行
 * MIN_PRIORITY = 1
 * NORM_PRIORITY = 5
 * MAX_PRIORITY = 10
 * 11.getPriority() 获取线程的优先级
 * 12.setPriority() 设置线程优先级
 *
 */

class MethodThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            if (i % 2 == 0) {
//                //不能抛异常==> 父类的run() 没有抛异常
//                try {
//                    sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                System.out.println(getName() + "优先级==>" + getPriority()+ ":" + i);
            }
            if (i % 20 == 0) {
//                this.yield();
                //加不加this都是代表当前线程
                yield();
            }

        }
    }

   //创建构造方法
    public MethodThread() {

    }

    public MethodThread(String name) {
        super(name);
    }

}

public class ThreadMethod {

    public static void main(String[] args) {

        MethodThread m1 = new MethodThread();

//        MethodThread m2 = new MethodThread("线程二");

        //设置线程名
        m1.setName("线程一");
        //设置优先级
        m1.setPriority(10);
        Thread.currentThread().setName("主线程======>");

        m1.start();

        for (int i = 0; i < 100 ; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "优先级==>" + Thread.currentThread().getPriority()+":" + i);
            }
            if (i == 55) {
                try {
                    m1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        //判断线程是否存活
        System.out.println(m1.isAlive());

    }


}
