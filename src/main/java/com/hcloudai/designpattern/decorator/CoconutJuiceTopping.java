package com.hcloudai.designpattern.decorator; /***********************************************************************
 * Module:  CoconutJuiceTopping.java
 * Author:  Administrator
 * Purpose: Defines the Class CoconutJuiceTopping
 ***********************************************************************/

import com.hcloudai.designpattern.decorator.drink.Drink;

/** 椰汁配料 */
public class CoconutJuiceTopping extends ToppingDecorator {

   public CoconutJuiceTopping(Drink drink) {
      super(drink);
      cost = 5;
      describe = "椰汁配料";
   }



}