package com.intyt.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStream演示
 * @author twy
 *
 */
public class StreamIODemo {
	
	public static void main(String[] args) {
		File inPic=new File("src/com/intyt/io/1.jpg");
		File outPic=new File("src/com/intyt/io/2.jpg");
		//创建FileInputStream对象，用来读取字节流
		FileInputStream fin=null;
		//创建FileOutputStream对象，用来写出字节流
		FileOutputStream fout=null;
		//缓冲指定文件读取
		BufferedInputStream bin=null;
		//缓冲指定文件写出
		BufferedOutputStream bout=null;
		try {
			fin=new FileInputStream(inPic);
			fout=new FileOutputStream(outPic);
			bin=new BufferedInputStream(fin);
			bout=new BufferedOutputStream(fout);
			int temp=0;
			while((temp=bin.read())!=-1){
				bout.write(temp);
			}
			bout.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(bin!=null){
				try {
					bin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fin!=null){
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bout!=null){
				try {
					bout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fout!=null){
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
