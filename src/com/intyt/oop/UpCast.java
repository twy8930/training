package com.intyt.oop;


/**
 * 向上转型演示
 * @author twy
 *
 */
public class UpCast {
	
	static void animalEat(Animal animal){
		System.out.println(animal.name+" can eat food.");
	}
	
	static void dogEat(Dog dog){
		System.out.println(dog.name+" can eat bone.");
//		System.out.println(dog.name+"`s favorate food is "+dog.favoritFood);
	}
	
	public static void main(String[] args) {
		
		Dog dog=new Dog();
		UpCast.animalEat(dog);
		
//		Animal animal=new Animal();
//		UpCast.dogEat(animal);//编译错误
		
	}

}
