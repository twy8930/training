package com.intyt.reflection;

/**
 * 获取接口和父类
 * @author twy
 *
 */
public class ObtainAncestor {

	public static void main(String[] args) {
		try {
			Class a = Class.forName("com.intyt.reflection.A");
			// 获取反射类的接口
			Class[] theInterfaces = a.getInterfaces();
			for (int i = 0; i < theInterfaces.length; i++)
				System.out.println("接口:"+theInterfaces[i].getName());
			// 获取反射类的父类（超类），单继承
			Class theSuperclass = a.getSuperclass();
			System.out.println("父类:"+theSuperclass.getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
