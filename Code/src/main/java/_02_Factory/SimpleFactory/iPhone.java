package _02_Factory.SimpleFactory;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: iPhone
 */
public class iPhone implements Phone{
    @Override
    public void ringPhone() {
        System.out.println("iPhone,乔布斯的二舅子");
    }
}
