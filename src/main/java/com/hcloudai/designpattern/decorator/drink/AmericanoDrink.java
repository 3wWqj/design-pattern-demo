package com.hcloudai.designpattern.decorator.drink; /***********************************************************************
 * Module:  AmericanoDrink.java
 * Author:  Administrator
 * Purpose: Defines the Class AmericanoDrink
 ***********************************************************************/

/**
 * 美式咖啡
 */
public class AmericanoDrink extends Drink {
    public AmericanoDrink() {
        cost = 33;
        describe = "美式咖啡";
    }

}