package com.intyt.thread;

/**
 * 主线程演示
 * @author twy
 *
 */
public class MainThreadDemo {
	
	public static void main(String[] args) {
		Thread a=new Thread(new Child());
		a.start();
		System.out.println("主线程结束");
	}

}

class Child implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}