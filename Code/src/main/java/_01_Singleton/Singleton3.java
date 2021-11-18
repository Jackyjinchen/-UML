package _01_Singleton;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: 懒汉式（线程不安全）
 */
class Singleton3 {
    private static Singleton3 instance;
    private Singleton3() {}
    //提供getter
    public static Singleton3 getInstance() {
        if(instance == null) {
            System.out.println("没有，new一个 懒汉式（线程不安全）");
            instance = new Singleton3();
        }
        return instance;
    }

}