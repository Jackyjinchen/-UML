package _02_Factory.SimpleFactory;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: MiPhone
 */
public class MiPhone implements Phone{
    @Override
    public void ringPhone() {
        System.out.println("小米，为发烧而生");
    }
}
