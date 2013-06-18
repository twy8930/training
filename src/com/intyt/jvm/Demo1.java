package com.intyt.jvm;

/**
 * 存储区域演示
 * @author twy
 *
 */
public class Demo1 {
	
	public static void main(String[] args) {
		String s1=new String("abc");
		String s2="abc";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	}

}
