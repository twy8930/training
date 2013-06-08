package com.intyt.oop;

/**
 * 狗类（子类）
 * @author twy
 *
 */
public class Dog extends Animal{
	
	public String favoritFood;
	
	public void eat(){
		System.out.println("I eat bone.");
	}
	
	public void bark(){
		System.out.println("wangwang!");
	}

}
