package com.google.exception_handling;

/**
 * 描述了java的异常处理机制处理java异常中checked异常通过使用try块或者使用throws关键字的不同方法
 * RuntimeException()异常可以不处理系统会默认抛出异常进行处理
 */

public class CheckedExceptionTest {

    public static void main(String[] args){

        try {
            //调用声明抛出Checked异常的方法,要么显式捕获该异常,要么在main方法中再次声明抛出
            throwsChecked(1);
            //此处的异常将不会被抛出 ===> catch块一旦捕获异常try块将停止运行
            throwsRuntime(4);


        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        //此处的throwsRuntime方法的不同位置的结果不同
    }

    public static void throwsChecked (int a)throws Exception{
        //自行抛出Exception异常,该代码必须处于try块里,或处于带throws声明的方法中
        if(a>0){
            throw new Exception("a的值大于零，不符合要求");
        }
    }

    public static void throwsRuntime (int a){

        //自行抛出RuntimeException异常,既可以显式捕获该异常,也可完全不理会该异常,把该异常交给该方法调用者处理
        if(a>0){
            throw new RuntimeException("a的值大于零，不符合要求");
        }
    }
}

