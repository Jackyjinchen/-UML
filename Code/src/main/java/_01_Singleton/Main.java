package _01_Singleton;

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

    }
}
