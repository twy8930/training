package com.intyt.container;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set演示
 * @author twy
 *
 */
public class SetDemo {
	
	public static void hashSet(){
		Set<Person> set=new HashSet<Person>();
		Person person1=new Person("xiaowang",10);
		Person person2=new Person("xiaowang",10);
		set.add(person1);
		set.add(person2);
		for(Person person:set) {
			System.out.println(person.name+" "+person.age);
		}
	}
	
	public static void treeSet(){
		Set<Person> set=new TreeSet<Person>();
		Person person1=new Person("a",14);
		Person person2=new Person("b",10);
		Person person3=new Person("c",16);
		Person person4=new Person("d",7);
		Person person5=new Person("e",20);
		set.add(person1);
		set.add(person2);
		set.add(person3);
		set.add(person4);
		set.add(person5);
		for(Person person:set) {
			System.out.println(person.name+" "+person.age);
		}
	}
	
	public static void main(String[] args) {
//		hashSet();
		treeSet();
	}

}

