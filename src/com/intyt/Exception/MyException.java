package com.intyt.Exception;

/**
 * 自定义异常
 * @author twy
 *
 */
public class MyException extends Exception{
	
	public MyException(){
		super("你遇到了一个自定义异常");
	}

}
