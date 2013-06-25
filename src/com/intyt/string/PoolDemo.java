package com.intyt.string;

/**
 * 字符串池演示
 * @author twy
 *
 */
public class PoolDemo {
	
	public static void main(String[] args) {
		String s1=new String("Love is easy");
		String s2=s1.intern();
		String s3="Love is easy";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
	}

}
