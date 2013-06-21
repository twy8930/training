package com.intyt.thread;

/**
 * 线程状态演示
 * @author twy
 *
 */
public class ThreadStatusDemo extends Thread{
	
	public static void main(String[] args) {
		//进入新建状态
		ThreadStatusDemo newThread=new ThreadStatusDemo();
		//进入就绪状态
		newThread.start();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//进入死亡状态
		newThread.stop();
	}
	
	//进入运行状态
	public void run(){
		int i=1;
		while(true){
			
			if(i==5){
				//进入阻塞状态
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("运行："+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(i==10){
				//进入死亡状态
				stop();
			}
			
			i++;
		}
	}

}
