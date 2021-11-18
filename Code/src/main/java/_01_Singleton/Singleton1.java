package _01_Singleton;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: 饿汉式（静态常量）
 */
class Singleton1 {
    // 构造器私有化
    private Singleton1() {}
    //本类创建
    private final static Singleton1 instance = new Singleton1();
    //提供getter
    public static Singleton1 getInstance() {
        System.out.println("Get Instance 饿汉式（静态常量）");
        return instance;
    }

}