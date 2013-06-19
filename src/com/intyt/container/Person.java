package com.intyt.container;

/**
 * 
 * @author twy
 *
 */
//implements Comparable<Person>
public class Person{
	
	public String name;
	public int age;
	
	public Person(String name){
		this.name=name;
	}
	
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
//	@Override
//	public int hashCode(){
//        return name.hashCode();
//    }
//	
//	@Override
//	public boolean equals(Object person){
//		return name.equals(((Person)person).name);
//	}
//	
//	@Override
//	public int compareTo(Person o) {
//		//升序
//		return age-o.age;
//	}
	
}
