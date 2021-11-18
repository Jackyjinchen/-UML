package _01_Singleton;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: 双重检查
 */


class Singleton5 {
    private static Singleton5 instance;

    private Singleton5() {}

    //提供getter
    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    System.out.println("没有，new一个 懒汉式（线程安全）效率低");
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

}
