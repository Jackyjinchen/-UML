package _04_Decoration;

import _04_Decoration.Decorator.Mocha;
import _04_Decoration.Decorator.Whip;

/**
 * @Version 1.0
 * @Author: jackyjinchen
 * @Date: 2021/11/18
 * @Content: 装饰者模式
 */
public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println("Description: " + beverage.getDescription() + " $" + beverage.cost());

    }
}
