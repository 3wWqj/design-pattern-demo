package com.hcloudai.designpattern.decorator.drink; /***********************************************************************
 * Module:  LatteDrink.java
 * Author:  Administrator
 * Purpose: Defines the Class LatteDrink
 ***********************************************************************/

/** 拿铁 */
public class LatteDrink extends Drink {
   public LatteDrink() {
      cost = 37;
      describe = "拿铁";
   }

}