package com.intyt.classes;

/**
 * 抽象类
 * @author twy
 *
 */
public abstract class Fruit {
	
	double weight;
	String color;
	
	//抽象方法
	abstract void showColor();
	
	//一般方法
	void showWeight(){
		System.out.println("weight is "+weight);
	}
	

}
