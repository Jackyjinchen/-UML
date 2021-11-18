package _01_Singleton;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: 懒汉式（线程安全）效率低
 */
class Singleton4 {
    private static Singleton4 instance;
    private Singleton4() {}
    //提供getter
    public static synchronized Singleton4 getInstance() {
        if(instance == null) {
            System.out.println("没有，new一个 懒汉式（线程安全）效率低");
            instance = new Singleton4();
        }
        return instance;
    }

}
