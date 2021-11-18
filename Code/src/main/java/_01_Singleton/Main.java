package _01_Singleton;

import java.lang.reflect.Constructor;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: 单例模式
 */
public class Main {
    public static void main(String[] args) {
        // 饿汉式（静态常量）
        Singleton1 singleton1 = Singleton1.getInstance();

        // 饿汉式（静态代码块）
        Singleton2 singleton2 = Singleton2.getInstance();

        // 懒汉式（线程不安全）
        Runnable task1 = ()->{
            String threadName = Thread.currentThread().getName();
            Singleton3 s3 = Singleton3.getInstance();
        };
        for(int i=0;i<1000;i++){
            new Thread(task1,"" + i).start();
        }

        // 懒汉式（线程安全）效率低
        Runnable task2 = ()->{
            String threadName = Thread.currentThread().getName();
            Singleton4 s3 = Singleton4.getInstance();
        };
        for(int i=0;i<1000;i++){
            new Thread(task2,"" + i).start();
        }

        // 双重检查
        Runnable task3 = ()->{
            String threadName = Thread.currentThread().getName();
            Singleton5 s3 = Singleton5.getInstance();
        };
        for(int i=0;i<1000;i++){
            new Thread(task3,"" + i).start();
        }

        // 静态内部类
        Runnable task4 = ()->{
            String threadName = Thread.currentThread().getName();
            Singleton6 s3 = Singleton6.getInstance();
        };
        for(int i=0;i<1000;i++){
            new Thread(task4,"" + i).start();
        }

        // 枚举（避免反射攻击）
        Singleton7 singleton7 = Singleton7.INSTANCE;


    }

}
