package com.intyt.classes;

/**
 * 演示类的实例化
 * @author twy
 *
 */
public class Person {
	
//	public Person(){
//		System.out.println("调用了无参构造器");
//	}
//	
//	public Person(String name,int age){
//		this.name=name;
//		this.age=age;
//		System.out.println("调用了有参构造器");
//	}
	
	//动态成员变量
	String name;
	int age;
	//静态成员变量
	static int maxAge;//最大年龄
	
	//动态方法
	void introduceMyself(){
		System.out.println("hi");
		System.out.println("My name is "+name);
		System.out.println("I`m "+age+" years old");
	}
	
	//静态方法
	static void showMaxAge(){
		System.out.println("人类的年龄上限是："+maxAge);
	}
	
	//好比一个空调的控制面板
	public static void main(String[] args) {
		Person.showMaxAge();
		Person xiaoming=new Person();
		xiaoming.introduceMyself();
	}
}
