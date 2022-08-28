package com.hcloudai.designpattern.decorator; /***********************************************************************
 * Module:  ToppingDecorator.java
 * Author:  Administrator
 * Purpose: Defines the Class ToppingDecorator
 ***********************************************************************/

import com.hcloudai.designpattern.decorator.drink.Drink;

/** 配料装饰类 */
public class ToppingDecorator extends Drink {
   protected Drink drink;

   public ToppingDecorator(Drink drink) {
      this.drink = drink;
   }
   @Override
   public String describe() {
      return drink.describe() + "#" + super.describe() ;
   }

   @Override
   public double cost() {
      return super.cost() + drink.cost();
   }
}