package com.google.exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

/**
 * 描述了java异常的捕获和处理方法
 *
 * 单异常捕获、多异常捕获、以及异常的访问异常信息处理
 *
 * try（）catch{}块
 */

public class ExceptionTest {
    public static void main(String[] args){


        //描述了java的一些输入和算法的异常
        try{
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int number3 = number1/number2;
        }catch (IndexOutOfBoundsException ie){
            System.out.println("数组越界输入的参数不够");
        }catch (NumberFormatException ne){
            System.out.println("数据格式异常：程序只能接受整形参数");
        }catch(ArithmeticException ae){
            System.out.println("算术异常");
        }catch (Exception e){
            System.out.println("未知异常");
        }

        //描述了java的空指针异常
        Date date = null;
        Date date1 =new Date();
        System.out.println(date1.getTime());

        try{
            System.out.println(date.after(new Date()));
        }catch (RuntimeException re){
            System.out.println("java运行异常" );
        }

        //添加此处的catch块将会出现异常-java RuntimeException包含了NullPointerException
//        catch (NullPointerException ne){
//            System.out.println("空指针异常");
//        }
        catch (Exception e){
            System.out.println("未知异常");
        }

        //描述了异常的catch块实现了多异常捕获
        int a[] =new int [2];
        try {
            System.out.println("输出数组中的第三个元素"+a[3]);
        }catch (ArrayIndexOutOfBoundsException |NullPointerException |ArithmeticException ae){
            System.out.println("程序发生了数组越界，空指针异常、算术异常其中之一");

            //下面的程序报错 -因为ae是多异常的的变量所以会默认被final修饰，不能被重新赋值
//            ae = new ArithmeticException("test");
        }catch (Exception e){
            System.out.println("程序出现了未知的异常");
            //因为此处的变量e是单异常变量所以并没有被final修饰所以可以重新赋值
            e = new RuntimeException("test");
        }

        //访问异常信息处理通过getMessage()方能输出标准的错误信息
        try{
            FileInputStream file = new FileInputStream("a.txt");
        } catch (FileNotFoundException fileE) {
            // getMassage()-返回该异常的详细描述字符串
            System.out.println(fileE.getMessage());
            //printStackTrace()-将该异常的跟踪栈信息输出到标准错误输出
            fileE.printStackTrace();
        }


    }
}
