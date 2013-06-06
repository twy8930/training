package com.intyt.flowcontrol;

/**
 * 流程控制演示
 * @author twy
 *
 */
public class FlowControlDemo {
	
	//true和false
	public static void trueFalse(){
		boolean flag=true;
		if(flag){
			System.out.println("条件为真");
		}else{
			System.out.println("条件为假");
		}
		
	}
	
	//if-else
	public static void ifElse(){
		int count=13;
		if(count<10){
			System.out.println("count小于10");
		}else if(count>=10&&count<20){
			System.out.println("count大于等于10，小于20");
		}else{
			System.out.println("count大于20");
		}
	}
	
	//do-while
	public static void doWhile(){
		int count=0;
		while(count<10){
			System.out.println("count=="+count);
			count++;//产生终止循环的条件
		}
		
		//保证do中的代码至少执行一次
		boolean flag=false;
		do{
			System.out.println("flag："+flag);
		}while(flag);
	}
	
	//for
	public static void forDemo(){
		//初始化表达式，布尔表达式，步进表达式都可以为空
//		for (;;) {
//			System.out.println("执行一次");
//		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i:"+i);
		}
		
		//用于数组和容器
		int[] array={1,2,3,4,5};
		for (int j:array) {
			System.out.println("j:"+j);
		}
	}
	
	//switch
	public static void switchDemo(){
		
		//整数选择因子,break用于跳出switch
		char theChar='d';
		switch (theChar) {
		case 'a':
			System.out.println("theChar is a");
			break;
		case 'b':
			System.out.println("theChar is b");
			break;
		case 'c':
			System.out.println("theChar is c");
			break;
		case 'd':
			System.out.println("theChar is d");
			break;
		case 'e':
			System.out.println("theChar is e");
			break;
		default:
			System.out.println("I don`t know theChar.");
			break;
		}
	}
	
	//break
	public static void breakDemo(){
		for (int i = 0; i < 10; i++) {
			if(i==5){
				break;
			}
			System.out.println(i);
		}
	}
	
	//continue
	public static void continueDemo(){
		for (int i = 0; i < 10; i++) {
			if(i==5){
				continue;
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		continueDemo();
	}

}
