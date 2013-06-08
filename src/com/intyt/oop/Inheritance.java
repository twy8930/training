package com.intyt.oop;

/**
 * 继承演示
 * @author twy
 *
 */
public class Inheritance {
	
	public static void main(String[] args) {
		B b=new B();
		b.printI();
	}

}

//父类
abstract class A{
	
	int i=1;
	
//	public A(){
//		System.out.println("A 初始化");
//	}
	
	void printI(){
		System.out.println(i);
	}
	
}
//子类
class B extends A{
	
	int i=2;
	
//	public B(){
//		System.out.println("B 初始化");
//	}
	
	void printI(){
//		System.out.println("A的i"+super.i);
//		System.out.println("B的i:"+i);
	} 
	
}

