package com.google.basic_library_class;


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 描述了java的Random类以及ThreadLocalRandom类
 * Random类专门用于生成一个随机数
 * 它有两个构造器，一个是使用默认的种子（以当前时间为种子），另一个是显式传入一个long整型的种子
 * 相比于Math的random()方法，Random类提供了更多的方式来生成各种伪随机数
 * 既可以生成浮点类型的伪随机数，也可以生成整数类型的伪随机数，还可以指定生成随机数的范围
 *
 * 使用相同的种子可以产生相同的随机数
 * 为了避免产生相同的随机数常推荐使用当前时间作为 Random对象的种子
 *  Random  rand  = new  Random (System.currentTimeMills()) ;
 *
 *
 *  ThreadLocalRandom类是Random的增强版
 *  在并发访问的环境下，使用ThreadLocalRandom来代替Random可以减少多线程资源竞争，保证线程安全
 *  ThreadLocalRandom与Random用法相似  ThreadLocalRandom可以设置生成随机数的范围
 *  它提供了一个静态方法current( )方法来获取对象，然后调用各种nextXxx( ) 方法来获取各种基本类型的随机数
 */
public class RandomTest {

    public static void main (String[] args){

        Random rand = new Random();
        //随机产生布尔类型的随机数
        System.out.println(rand.nextBoolean());
        // 生成0.0~1.0之间的伪随机double数
        System.out.println(rand.nextDouble());
        // 生成一个处于int整数取值范围的伪随机整数
        System.out.println(rand.nextInt());
        // 生成0~26之间的伪随机整数
        System.out.println(rand.nextInt(26));


        //使用相同的种子产生相同的随机数
        Random rand1 = new Random(50);
        Random rand2 = new Random(50);
        System.out.println(rand1.nextInt());
        System.out.println(rand2.nextInt());

        //使用当前时间作为种子产生随机数
        Random rand3 = new Random(System.currentTimeMillis());
        Random rand4 = new Random(System.currentTimeMillis()+1000);
        System.out.println(rand3.nextInt());
        System.out.println(rand4.nextInt());

        //通过ThreadLocalRandom类来生成随机数
        ThreadLocalRandom rand5 = ThreadLocalRandom.current();
        ThreadLocalRandom rand6 = ThreadLocalRandom.current();
        int  val  = rand5.nextInt(10);
        long va2 = (long) rand6.nextDouble(10.00);
        System.out.println(val);
        System.out.println(va2);

    }

}
