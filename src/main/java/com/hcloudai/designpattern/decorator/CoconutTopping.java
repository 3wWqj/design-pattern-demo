package com.hcloudai.designpattern.decorator; /***********************************************************************
 * Module:  CoconutTopping.java
 * Author:  Administrator
 * Purpose: Defines the Class CoconutTopping
 ***********************************************************************/

import com.hcloudai.designpattern.decorator.drink.Drink;

/** 椰果配料 */
public class CoconutTopping extends ToppingDecorator {
   public CoconutTopping(Drink drink) {
      super(drink);
      cost = 2;
      describe = "椰果配料";
   }
}