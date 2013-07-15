package com.intyt.generics;

/**
 * 泛型的嵌套演示
 * @author twy
 * 
 */
class Info2<T, V> { // 接收两个泛型类型
	private T var;
	private V value;

	public Info2(T var, V value) {
		this.setVar(var);
		this.setValue(value);
	}

	public void setVar(T var) {
		this.var = var;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public T getVar() {
		return this.var;
	}

	public V getValue() {
		return this.value;
	}
};

class Demo2<S> {
	private S info;

	public Demo2(S info) {
		this.setInfo(info);
	}

	public void setInfo(S info) {
		this.info = info;
	}

	public S getInfo() {
		return this.info;
	}
};

public class GenericsDemo07 {
	public static void main(String args[]) {
		Demo2<Info2<String, Integer>> d = null; // 将Info作为Demo的泛型类型
		Info2<String, Integer> i = null; // Info指定两个泛型类型
		i = new Info2<String, Integer>("汤姆", 30); // 实例化Info对象
		d = new Demo2<Info2<String, Integer>>(i); // 在Demo类中设置Info类的对象
		System.out.println("内容一：" + d.getInfo().getVar());
		System.out.println("内容二：" + d.getInfo().getValue());
	}
};