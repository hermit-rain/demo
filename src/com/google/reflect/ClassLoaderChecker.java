package com.google.reflect;

//C:/Users/hermi/Desktop/Wali.java
//public class Wali{
//    static{
//        System.out.println("hello wali");
//    }
//}

public class ClassLoaderChecker {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        MyClassLoader m = new MyClassLoader("C:/Users/hermi/Desktop/", "myClassLoader");
        Class c = m.loadClass("Wali");
        System.out.println(c.getClassLoader());
        c.newInstance();

    }
}
