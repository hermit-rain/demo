package com.google.thread.exercise;

/**
 * 练习--创建两个分线程，其中一个遍历100以内的偶数，另一个遍历100以内的奇数
 */

public class ExerciseTest1 {

    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();

        //通过匿名内部类的方式来创建分线程
        new Thread(){
            @Override
            public void run() {
                //遍历偶数
                for (int i = 0; i < 100 ; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }

                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                //遍历奇数
                for (int i = 0; i < 100 ; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }.start();

    }


}


class MyThread1 extends Thread {

    @Override
    public void run() {
        //遍历偶数
        for (int i = 0; i < 100 ; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        //遍历奇数
        for (int i = 0; i < 100 ; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

}



