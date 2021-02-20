package com.google.thread.exercise;

/**
 * 演示死锁问题
 *
 * 1.死锁：不同的线程分别占用对方需要的同步资源不放弃
 * 都等待对方先放弃自己需要的同步资源，就形成了死锁
 * 2.说明
 * 出项死锁后，不会出现异常，不会出现提示，只是所有的线程都处于阻塞状态无法继续
 * 我们使用同步时要避免死锁的出现
 *
 */

public class ExerciseTest2 {

    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (s1) {

                    s1.append("a");
                    s2.append("1");

                    //增加sleep()加大了产生死锁的可能
                    //此时线程1等待线程2释放 s2 ，而线程2等待线程1释放 s1 ===>产生死锁
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2) {

                        s1.append("b");
                        s2.append("2");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                synchronized (s2) {

                    s1.append("c");
                    s2.append("3");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s1) {

                        s1.append("d");
                        s2.append("4");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();


    }


}
