package com.intyt.thread;

/**
 * 向账户存钱 
 * @author twy
 *
 */
public class In extends Thread{

	public Account account;
	
	public In(Account account){
		this.account=account;
	}
	public void run(){
		//存10次，每次存1元
		for (int i = 0; i < 10000; i++) {
			account.count=account.count+1;
		}
	}
}
