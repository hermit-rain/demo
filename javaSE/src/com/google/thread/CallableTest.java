package com.google.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现多线程的 方式三 实现 Callable 接口的方式
 *
 * 1.创建一个实现了 Callable 接口的实现类
 * 2.实现call()，将此线程需要执行的方法声明到call()中
 * 3.创建Callable接口实现类的对象
 * 4.将此Callable接口实现类的对象作为参数传递到FutureTask构造器中，创建FutureTask 的对象
 * 5.将FutureTask对象作为参数传递到Thread类的构造器中，创建Thread类的对象并调用start();
 * 6.获取 Callable中的 call方法的返回值
 *
 * 如何理解实现Callable接口的方式要比实现Runnable接口创建多线程的方式强
 *
 * 1.call() 可以有返回值
 * 2.call() 可以抛出异常，被外面的异常捕获，获取异常的信息
 * 3.Callable 支持泛型
 *
 */



class NumThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
//        //如果不需要返回值可以返回null
//        return null;

    }
}


public class CallableTest {

    public static void main(String[] args) {

        NumThread numThread = new NumThread();

        FutureTask futureTask = new FutureTask(numThread);

        Thread t1 = new Thread(futureTask);

        t1.start();
//        //另一种写法
//        new Thread(futureTask).start();

        try {
            //get()的返回值即为 FutureTask 构造器参数Callable实现类重写的call()的返回值
            Object sum = futureTask.get();
            System.out.println(sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

}
