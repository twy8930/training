package com.intyt.reflection;

import java.lang.reflect.Field;

/**
 * 获取属性演示
 * @author twy
 *
 */
public class ObtainFiled {

	public static void main(String[] args) {
		A a = new A();
		Class temp = a.getClass();
		try {
			System.out.println("反射类中所有公有的属性");
			Field[] fb = temp.getFields();
			for (int j = 0; j < fb.length; j++) {
				Class<?> cl = fb[j].getType();
				System.out.println(fb[j].getName()+":"+cl);
			}

			System.out.println("反射类中所有的属性");
			Field[] fa = temp.getDeclaredFields();
			for (int j = 0; j < fa.length; j++) {
				Class<?> cl = fa[j].getType();
				System.out.println(fa[j].getName()+":"+cl);
			}
			
			System.out.println("反射类中私有属性的值");
			Field f = temp.getDeclaredField("sex");
			//设置为true才可访问私有属性
			f.setAccessible(true);
			//指定对象，获取指定对象的属性值
			boolean sex = (Boolean) f.get(a);
			System.out.println(f.getName()+":"+sex);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}