package com.intyt.thread;

/**
 * 测试线程互斥
 * @author twy
 *
 */
public class TestSyn {
	
	public static void main(String[] args) {
		Account account=new Account();
		account.count=0;
		In in=new In(account);
		Out out=new Out(account);
		
		in.start();
		out.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("账户余额:"+account.count);
	}

}
