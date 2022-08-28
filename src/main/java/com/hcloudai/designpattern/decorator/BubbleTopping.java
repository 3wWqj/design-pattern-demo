package com.hcloudai.designpattern.decorator; /***********************************************************************
 * Module:  BubbleTopping.java
 * Author:  Administrator
 * Purpose: Defines the Class BubbleTopping
 ***********************************************************************/

import com.hcloudai.designpattern.decorator.drink.Drink;

/** 珍珠配料 */
public class BubbleTopping extends ToppingDecorator {
   public BubbleTopping(Drink drink) {
      super(drink);
      cost = 3;
      describe = "珍珠配料";
   }
}