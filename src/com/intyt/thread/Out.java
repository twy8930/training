package com.intyt.thread;

/**
 * 从账户取钱
 * @author twy
 *
 */
public class Out extends Thread{
	
	public Account account;
	
	public Out(Account account){
		this.account=account;
	}
	public void run(){
		//取10次，每次取10元
		for (int i = 0; i < 10000; i++) {
			account.count=account.count-1;
		}
	}
}
