package com.intyt.thread;

/**
 * 演示死锁
 * @author twy
 *
 */
public class TestDeadLock {
	public static void main(String[] args) {
		A a = new A();
		B b = new B(a);
		a.set(b);
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
	}
}

class A implements Runnable {
	
	public B b;
	int count=0;

	public void run() {
		while (true) {
			synchronized (this) {
				b.write();
			}
		}
	}

	public void write() {
		synchronized (this) {
			System.out.println("a let b write "+count++);
		}
	}

	public void set(B b) {
		this.b = b;
	}
}

class B implements Runnable {
	
	public A a;
	int count=0;

	public B(A a) {
		this.a = a;
	}

	public void run() {
		while (true) {
			synchronized (this) {
				a.write();
			}
		}
	}
	
	public void write() {
		synchronized (this) {
			System.out.println("b let a write "+count++);
		}
	}
}