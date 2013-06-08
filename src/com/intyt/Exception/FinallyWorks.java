package com.intyt.Exception;

/**
 * 演示finally块
 * @author twy
 *
 */
public class FinallyWorks {
	
	static int count=0;
	
	public static void main(String[] args) {
		while(true){
			try {
				if(count++ == 0){
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println(count+" exception");
			} finally {
				System.out.println(count+" I`m finally clause");
				if(count==2){
					break;
				}
			}
		}
	}

}
