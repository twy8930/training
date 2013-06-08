package com.intyt.Exception;

/**
 * 使用自定义异常
 * 
 * @author twy
 * 
 */
public class UseMyException {

	public void fun() throws MyException {
		throw new MyException();
	}

	public static void main(String[] args) {
		UseMyException t = new UseMyException();
		try {
			t.fun();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
}
