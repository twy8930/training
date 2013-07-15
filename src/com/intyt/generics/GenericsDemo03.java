package com.intyt.generics;

/**
 * 受限泛型演示
 * @author twy
 *
 */
public class GenericsDemo03{
	public static void main(String args[]){
		Info<Integer> i1 = new Info<Integer>() ;		// 声明Integer的泛型对象
		Info<Float> i2 = new Info<Float>() ;			// 声明Float的泛型对象
		i1.setVar(30) ;									// 设置整数，自动装箱
		i2.setVar(30.1f) ;								// 设置小数，自动装箱
		fun(i1) ;
		fun(i2) ;
	}
	public static void fun(Info<? extends Number> temp){	// 只能接收Number及其Number的子类
		System.out.println(temp) ;
	}
}