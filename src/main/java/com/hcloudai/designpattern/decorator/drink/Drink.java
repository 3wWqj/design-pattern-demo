package com.hcloudai.designpattern.decorator.drink; /***********************************************************************
 * Module:  Drink.java
 * Author:  Administrator
 * Purpose: Defines the Class Drink
 ***********************************************************************/

/** 饮料类 */
public class Drink {

   protected String describe;
   protected double cost;
   
   /** 获取饮品价格 */
   public double cost() {
      return this.cost;
   }
   
   /** 获取饮品描述 */
   public String describe() {
      return this.describe;
   }

}