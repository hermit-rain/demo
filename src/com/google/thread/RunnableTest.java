package com.google.thread;

/**
 * 创建多线程  方式二 实现 Runnable接口
 *
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法 run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 *
 * 比较创建线程的两种方式  (继承Thread类&&实现Runnable接口)
 *
 * 开发中我们优先选择实现 Runnable接口的方式
 * 1.实现的方式没有类的单继承的局限性
 * 2.实现的方式更适合来处理多个线程共享数据的情况
 *
 * 两种创建方式的联系
 *
 * 1.public class Thread implements Runnable ==> Thread类本身也实现了Runnable接口
 * 2.都需要重写run()方法，将线程要执行的逻辑声明在run()中
 *
 */

//1.创建一个实现了Runnable接口的类
class MyThread2 implements Runnable{

    // 2.实现类去实现Runnable中的抽象方法 run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "==>" + i);
            }

        }

    }
}


public class RunnableTest {

    public static void main(String[] args) {
        //3.创建实现类的对象
        MyThread2 myThread2 = new MyThread2();
        //4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(myThread2);
        t1.setName("线程1");
        //5.通过Thread类的对象调用start()
        //该start(): 1.启动线程 2.调用当前线程的run()
        // 因为Thread类的底层对run()设置,所以调用Thread类的run()实际也是调用分线程的run();
        t1.start();

        //再创建一个线程
        Thread t2 = new Thread(myThread2);
        t2.setName("线程2");

        t2.start();


    }

}
