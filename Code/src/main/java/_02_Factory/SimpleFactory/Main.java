package _02_Factory.SimpleFactory;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content:
 */
public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone iPhone = phoneFactory.makePhone("iPhone");
        Phone miPhone = phoneFactory.makePhone("MiPhone");
        iPhone.ringPhone();
        miPhone.ringPhone();
    }
}
