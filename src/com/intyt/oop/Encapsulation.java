package com.intyt.oop;

/**
 * 封装演示
 * @author twy
 *
 */
public class Encapsulation {
	public static void main(String[] args) {
		double originPrice=100;
		int level=2;//金卡会员
		PriceCounter.getPrice(originPrice, level);
	}
}

//价格计算器
class PriceCounter{
	
	private static double[] levelDiscount={1,0.95,0.9};//普通用户，银卡会员，金卡会员
	
	private static double discount=0.8;//折扣
	
	//内部调整价格
	private static double priceAdjust(double originPrice,int level){
		double finalPrice=0;
		finalPrice=originPrice*discount*levelDiscount[level];
		return finalPrice;
	}
	
	//获得价格
	public static void getPrice(double originPrice,int level){
		double price=priceAdjust(originPrice,level);
		System.out.println("商品的折扣价格是:￥"+price);
	}
	
}
