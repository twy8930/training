package com.intyt.thread;

/**
 * 守护线程演示
 * 
 * @author twy
 * 
 */
public class DaemonDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyDaemon(100), "t1");
		Thread t2 = new Thread(new MyDaemon(Integer.MAX_VALUE) ,"t2");
		// t2被设置为守护线程
		t2.setDaemon(true);
		t2.start();
		t1.start();
	}
}

class MyDaemon implements Runnable {
	
	int count=0;
	
	public MyDaemon(int count){
		this.count=count;
	}
	
	public void run() {
		for (long i = 0; i < count; i++) {
			System.out.println(Thread.currentThread().getName() + "第" + i
					+ "次执行！");
			try {
				Thread.sleep(7);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
