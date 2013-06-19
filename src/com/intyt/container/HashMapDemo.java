package com.intyt.container;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * HashMap演示
 * @author twy
 *
 */
public class HashMapDemo {

	// 创建一个同步的HashMap
	Map<String, Object> synchronizedMap = Collections
			.synchronizedMap(new HashMap<String, Object>());

	public static void main(String[] args) {
		
		//map的三种遍历方法
		Map<String, Object> hashMap = new HashMap<String, Object>();

		// 方法一:先获取Key的集合，然后遍历Key集合取Key再取值
		Set<String> keySet = hashMap.keySet();
		for (Iterator<String> it = keySet.iterator(); it.hasNext();) {
			String key = it.next();
			System.out.println(key + ":" + hashMap.get(key));
		}

		// 方法二:直接遍历Value的集合
		Collection<Object> values = hashMap.values();
		for (Iterator<Object> it = values.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}

		// 方法三:先获取Map内置Entry对象，然后遍历Entry对象获取Key和Value
		Set<Map.Entry<String, Object>> entrySet = hashMap.entrySet();
		for (Iterator<Map.Entry<String, Object>> it = entrySet.iterator(); it
				.hasNext();) {
			Map.Entry<String, Object> entry = it.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
