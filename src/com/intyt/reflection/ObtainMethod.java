package com.intyt.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取方法演示
 * 
 * @author twy
 * 
 */
public class ObtainMethod {

	public static void main(String[] args) {
		A a=new A("xiaowang", 20, true);
		Class aClass = a.getClass();
		String className = aClass.getName();
		Method[] m = aClass.getMethods();
		for (int i = 0; i < m.length; i++) {
			// 输出方法的返回类型
			System.out.print(m[i].getReturnType().getName());
			// 输出方法名
			System.out.print(" " + m[i].getName() + "(");
			// 获取方法的参数
			Class[] parameterTypes = m[i].getParameterTypes();
			for (int j = 0; j < parameterTypes.length; j++) {
				System.out.print(parameterTypes[j].getName());
				if (parameterTypes.length > j + 1) {
					System.out.print(",");
				}
			}
			System.out.println(")");
			//执行方法
			if(m[i].getName().equals("introduce")){
				try {
					m[i].invoke(a);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
