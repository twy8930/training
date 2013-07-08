package com.intyt.reflection;

import java.lang.reflect.Constructor;

/**
 * 获取构造函数演示
 * 
 * @author twy
 * 
 */
public class ObtainConstructor {

	public static void main(String[] args) {
		try {
			Class a = Class.forName("com.intyt.reflection.A");
			// 获取指定类的类名
			String className = a.getName();
			// 获取指定类的构造方法
			Constructor[] theConstructors = a.getConstructors();
			for (int i = 0; i < theConstructors.length; i++) {
				// 获取指定构造方法的参数的集合
				Class[] parameterTypes = theConstructors[i].getParameterTypes();
				System.out.print(className + "(");
				for (int j = 0; j < parameterTypes.length; j++) {
					System.out.print(parameterTypes[j].getName()+" ");
				}
				System.out.println(")");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
