package com.intyt.container;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * WeakHashMap演示
 * @author twy
 *
 */
public class WeakHashMapDemo {

	private static Map<String, String> map;

	public static void main(String args[]) {
		map = new WeakHashMap<String, String>();
		//如果不用new创建字符串，map中的key会是一个指向常量池的引用，如果用new创建字符串,
		//map中的key会是一个指向常量池的引用的引用。
		map.put(new String("Scott"), "McNealey");
		Runnable runner = new Runnable() {
			public void run() {
				while (map.containsKey("Scott")) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException ignored) {
					}
					System.out.println("Checking for empty");
					System.gc();
				}
			}
		};
		Thread t = new Thread(runner);
		t.start();
		System.out.println("Main joining");
		try {
			t.join();
		} catch (InterruptedException ignored) {
		}
	}

}
