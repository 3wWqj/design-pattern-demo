package com.hcloudai.designpattern.decorator; /***********************************************************************
 * Module:  SingleCreamTopping.java
 * Author:  Administrator
 * Purpose: Defines the Class SingleTopping
 ***********************************************************************/

import com.hcloudai.designpattern.decorator.drink.Drink;

/** 稀奶油配料 */
public class SingleCreamTopping extends ToppingDecorator {

   public SingleCreamTopping(Drink drink) {
      super(drink);
      cost = 7;
      describe = "稀奶油配料";
   }
}