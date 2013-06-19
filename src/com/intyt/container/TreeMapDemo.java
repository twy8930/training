package com.intyt.container;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap演示
 * @author twy
 *
 */
public class TreeMapDemo {
	
	public static void main(String[] args) {
		Person person1 = new Person("马先生", 20);
		Person person2 = new Person("李先生", 30);
		Person person3 = new Person("王小姐", 18);
		Person person4 = new Person("张小姐", 32);
		Map<Integer, Person> map = new HashMap<Integer, Person>();
		map.put(person1.age, person1);
		map.put(person2.age, person2);
		map.put(person3.age, person3);
		map.put(person4.age, person4);
		System.out.println("由HashMap类实现的Map集合，无序：");
		for (Iterator<Integer> it = map.keySet().iterator(); it.hasNext();) {// 遍例集合
			Person person = map.get(it.next());
			System.out.println(person.age + " " + person.name);
		}
		System.out.println("由TreeMap类实现的Map集合，键对象升序：");
		TreeMap<Number, Person> treeMap = new TreeMap<Number, Person>();
		treeMap.putAll(map);
		for (Iterator<Number> it = treeMap.keySet().iterator(); it.hasNext();) {// 遍例集合
			Person person = treeMap.get(it.next());
			System.out.println(person.age + " " + person.name);
		}
		System.out.println("由TreeMap类实现的Map集合，键对象降序：");
		TreeMap<Number, Person> treeMap2 = new TreeMap<Number, Person>(Collections.reverseOrder());// 初始化为反转排序
		treeMap2.putAll(map);
		for (Iterator<Number> it = treeMap2.keySet().iterator(); it.hasNext();) {// 遍例集合
			Person person = (Person) treeMap2.get(it.next());
			System.out.println(person.age + " " + person.name);
		}
	}

}


