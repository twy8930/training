package com.intyt.Exception;

/**
 * 演示
 * @author twy
 *
 */
public class WithoutTryCatch {
	
	public static void main(String[] args) {
		int a=10;
		int b=0;
		/**
		 * 如果下一行代码不被try...catch包裹，程序将抛出异常，
		 * 并且不会继续执行
		 */
		int c=a/b;
		System.out.println("计算结束,c的值为"+c);
	}

}
