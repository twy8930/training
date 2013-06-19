package com.intyt.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * BufferedReader演示
 * @author twy
 *
 */
public class BufferedReaderDemo {
	
	public static void main(String[] args) {
		//创建FileReader对象，用来读取字符流
		FileReader fr=null;
		//缓冲指定文件的输入
		BufferedReader br=null;
		try {
			File poemFile=new File("src/com/intyt/io/poem.txt");
	        fr=new FileReader(poemFile);
	        br=new BufferedReader(fr); 
	        String oneLine="";
	        while(br.ready()){
	        	oneLine=br.readLine();
	        	System.out.println(oneLine);
	        }
	        br.close();
	        fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
