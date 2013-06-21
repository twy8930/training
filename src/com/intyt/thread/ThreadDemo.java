package com.intyt.thread;

/**
 * 线程演示
 * @author twy
 *
 */
public class ThreadDemo {
	
    public static void main(String[] args) {
    	Hello h1=new Hello("A");
    	Hello h2=new Hello("B");
        h1.start();
        h2.start();
    }

}

class Hello extends Thread {
	 
	private String name;
	 
    public Hello() {
 
    }
 
    public Hello(String name) {
        this.name = name;
    }
 
    public void run() {
    	//i改成100
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行     " + i);
        }
    }
   
}
