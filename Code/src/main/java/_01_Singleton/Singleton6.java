package _01_Singleton;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: 静态内部类
 */
class Singleton6 {
    private Singleton6() {}
    //懒加载 线程安全 静态内部类
    public static class SingletonInstance {
        private static final Singleton6 INSTANCE = new Singleton6();
    }
    public static Singleton6 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
