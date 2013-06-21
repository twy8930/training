package com.intyt.thread;

/**
 * 线程优先级演示
 * @author twy
 *
 */
public class PriorityDemo {

	//多运行几次
	public static void main(String[] args) {
		Thread h1 = new Thread(new MyRunnable(), "A");
		Thread h2 = new Thread(new MyRunnable(), "B");
		h1.setPriority(10);
		h2.setPriority(1);
		h1.start();
		h2.start();
	}
}

class MyRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 100; ++i) {
			System.out.println(Thread.currentThread().getName() + "运行" + i);
		}
	}

}