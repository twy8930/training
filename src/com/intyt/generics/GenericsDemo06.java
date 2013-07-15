package com.intyt.generics;

/**
 * 泛型方法演示
 * @author twy
 * 
 */
class Demo {
	public <T> T fun(T t) { // 可以接收任意类型的数据
		return t; // 直接把参数返回
	}
}

public class GenericsDemo06 {
	public static void main(String args[]) {
		Demo demo = new Demo(); // 实例化Demo对象
		String str = demo.fun("小明"); // 传递字符串
		System.out.println(str); // 输出内容
		int i = demo.fun(30); // 传递数字，自动装箱
		System.out.println(i); // 输出内容
	}
}