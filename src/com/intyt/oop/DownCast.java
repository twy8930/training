package com.intyt.oop;

/**
 * 向下转型演示
 * @author twy
 *
 */
public class DownCast {
	
	public static void main(String[] args) {
		
		//必须显示指定，强制类型转换
		Animal dog=new Dog();
//		dog.bark();
		Dog theDog=(Dog)dog;
		theDog.bark();
		
	}

}
