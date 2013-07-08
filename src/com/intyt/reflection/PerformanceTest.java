package com.intyt.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PerformanceTest {

	public static void main(String args[]) throws Exception {
		try {
			final int CALL_AMOUNT = 1000000;
			final PerformanceTest ri = new PerformanceTest();
			int idx = 0;
			// 直接使用正常的方法调用(没有反射)
			long millis = System.currentTimeMillis();
			for (idx = 0; idx < CALL_AMOUNT; ++idx)
				ri.getValue();
			System.out.println("直接调用" + CALL_AMOUNT
					+ "次花费"
					+ (System.currentTimeMillis() - millis) + "毫秒");

			// 通过反射调用域方法，而且每次都重新获取该域方法的反射类。
			millis = System.currentTimeMillis();
			for (idx = 0; idx < CALL_AMOUNT; idx++) {
				Method md = ri.getClass().getMethod("getValue", null);
				md.invoke(ri, null);
			}
			System.out.println("反射调用" + CALL_AMOUNT
					+ "次花费"
					+ (System.currentTimeMillis() - millis) + "毫秒");
		} catch (final NoSuchMethodException ex) {
			throw new RuntimeException(ex);
		} catch (final InvocationTargetException ex) {
			throw new RuntimeException(ex);
		} catch (final IllegalAccessException ex) {
			throw new RuntimeException(ex);
		}
	}

	public String getValue() {
		return this.value;
	}

	private String value = "some value";

}
