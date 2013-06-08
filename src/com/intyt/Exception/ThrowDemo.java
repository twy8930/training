package com.intyt.Exception;

/**
 * throw和throws
 * @author twy
 *
 */
public class ThrowDemo {
	
	//throws将异常抛出去，至于怎样处理，由调用work()的程序说了算
	public static void work(int a) throws MyException{
		if(a<0){
			throw new MyException();
		}else{
			//...work
		}
	}
	
	public static void main(String[] args) {
//		work(1);
	}

}
