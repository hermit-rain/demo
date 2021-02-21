package com.google.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建多线程 方式四 - 线程池
 *
 * 优点
 * 1.提高响应速度（减少了创建线程的时间）
 * 2.降低了资源的消耗 （重复利用线程池中的线程，不需要每次都创建）
 * 3.便于管理
 * corePoolSize 核心池大小
 * maximumPoolSize 最大线程数
 * keepAliveTime 线程没有任务的时候最多保持多长时间后会终止
 *
 */
class NumberThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread1 implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
        return null;
    }
}


public class PoolTest {

    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        //2.执行指定线程的操作，需要提过runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread());  //适合使用 Runnable
        service.submit(new NumberThread1());   //适合使用 Callable
        //关闭线程池
        service.shutdown();

    }


}
