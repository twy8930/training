package com.intyt.oop;

public class Polymorphism {
	

}

class Parent{
	
	void sayHi(){
		System.out.println("Hi,I`m parent");
	}
	
}

class Child extends Parent{
	
	void sayHi(){
		System.out.println("Hi,I`m child");
	}
	
	void sayHi(String guest){
		System.out.println("Hi,"+guest+",I`m child");
	}
	
	
}