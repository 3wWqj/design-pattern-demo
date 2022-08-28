package com.hcloudai.designpattern;


import com.hcloudai.designpattern.decorator.*;
import com.hcloudai.designpattern.decorator.drink.Drink;
import com.hcloudai.designpattern.decorator.drink.GrassJellyDrink;
import com.hcloudai.designpattern.decorator.drink.LatteDrink;
import org.junit.Test;

/**
 * 装饰器设计模式测试类
 *
 * @author wqj
 * @verion 1.0.0
 * 2022/8/28 0028 18:22
 */
public class DecoratorPatternTest {

    /**
     * 拿铁加椰汁
     */
    @Test
    public void testLatteDrinkWithCoconutJuice(){
        Drink latte = new LatteDrink();
        CoconutJuiceTopping coconutJuiceTopping = new CoconutJuiceTopping(latte);
        System.out.println(coconutJuiceTopping.describe());
        System.out.println(coconutJuiceTopping.cost());
    }


    /**
     * 拿铁加稀奶油
     */
    @Test
    public void testLatteDrinkWithSingleCream(){
        Drink latte = new LatteDrink();
        SingleCreamTopping coconutJuiceTopping = new SingleCreamTopping(latte);
        System.out.println(coconutJuiceTopping.describe());
        System.out.println(coconutJuiceTopping.cost());
    }

    /**
     * 拿铁加稀奶油加椰汁
     */
    @Test
    public void testLatteDrinkWithSingleCreamWithCoconutJuice(){
        Drink latte = new LatteDrink();
        SingleCreamTopping singleCreamTopping = new SingleCreamTopping(latte);
        CoconutJuiceTopping coconutJuiceTopping = new CoconutJuiceTopping(singleCreamTopping);
        System.out.println(coconutJuiceTopping.describe());
        System.out.println(coconutJuiceTopping.cost());
    }


    /**
     * 拿铁加稀奶油加椰汁双倍快乐
     */
    @Test
    public void testLatteDrinkWithSingleCreamWithCoconutJuiceDouble(){
        Drink latte = new LatteDrink();
        SingleCreamTopping singleCreamTopping = new SingleCreamTopping(latte);
        SingleCreamTopping singleCreamTopping2 = new SingleCreamTopping(singleCreamTopping);
        CoconutJuiceTopping coconutJuiceTopping = new CoconutJuiceTopping(singleCreamTopping2);
        CoconutJuiceTopping coconutJuiceTopping2 = new CoconutJuiceTopping(coconutJuiceTopping);

        System.out.println(coconutJuiceTopping2.describe());
        System.out.println(coconutJuiceTopping2.cost());
    }
    /**
     * 拿铁单品
     */
    @Test
    public void testLatte(){
        Drink latte = new LatteDrink();
        System.out.println(latte.describe());
        System.out.println(latte.cost());
    }

    /**
     * 拿铁加珍珠
     */
    @Test
    public void testLatteWithBubble(){
        Drink latte = new LatteDrink();
        //理论上是不可以这样加的，但是我们也是支持的
        BubbleTopping bubbleTopping = new BubbleTopping(latte);
        System.out.println(bubbleTopping.describe());
        System.out.println(bubbleTopping.cost());
    }


    /**
     * 来一杯烧仙草润润喉，所有配料来一波
     */
    @Test
    public void testGrassJellyWithCoconutWithBubble(){
        Drink latte = new GrassJellyDrink();

        BubbleTopping bubbleTopping = new BubbleTopping(latte);
        CoconutTopping coconutTopping = new CoconutTopping(bubbleTopping);
        System.out.println(coconutTopping.describe());
        System.out.println(coconutTopping.cost());
    }

}