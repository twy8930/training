package com.intyt.reflection;

/**
 * 演示用
 * @author twy
 *
 */
public class A {
	
	String name;
	public int age;
	private boolean sex;
	
	public A(){
		
	}
	
	public A(String name,int age,boolean sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public void introduce(){
		System.out.println("My name is "+name+",and I`m "+age+" years old.");
		
	}
	

}
