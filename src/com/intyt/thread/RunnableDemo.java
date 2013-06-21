package com.intyt.thread;

/**
 * 线程演示
 * @author twy
 *
 */
public class RunnableDemo {
	
	public static void main(String[] args) {
		Thread h1=new Thread(new Hi("A"));
		Thread h2=new Thread(new Hi("B"));
        h1.start();
        h2.start();
	}

}

class Hi implements Runnable {
	 
	private String name;
	 
    public Hi() {
 
    }
 
    public Hi(String name) {
        this.name = name;
    }
 
    public void run() {
    	//i改成100
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行     " + i);
        }
    }
   
}