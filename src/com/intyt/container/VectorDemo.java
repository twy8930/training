package com.intyt.container;

import java.util.Iterator;
import java.util.Vector;

/**
 * Vector演示
 * @author twy
 *
 */
public class VectorDemo {
	
	public static Vector<Object> vector=new Vector<Object>();
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			vector.add(i);
		}
		Thread changeVectorThread=new Thread(new ChangeVector());
		changeVectorThread.start();
		Iterator<Object> iterator=vector.iterator();
		for (;iterator.hasNext();) {
			System.out.println(iterator.next());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class ChangeVector implements Runnable{
	@Override
	public void run() {
		System.out.println("线程启动");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("线程改变Vector状态");
		VectorDemo.vector.add("添加");
	}
}