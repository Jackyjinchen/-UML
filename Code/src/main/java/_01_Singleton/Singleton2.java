package _01_Singleton;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: 饿汉式（静态代码块）
 */
class Singleton2 {
    private static Singleton2 instance;
    //通过静态代码块创建单例对象
    static {
        instance = new Singleton2();
    }
    //提供getter
    public static Singleton2 getInstance() {
        System.out.println("Get Instance 饿汉式（静态代码块）");
        return instance;
    }

}