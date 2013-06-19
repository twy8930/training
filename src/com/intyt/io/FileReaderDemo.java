package com.intyt.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader演示
 * @author twy
 *
 */
public class FileReaderDemo {
	
	public static void main(String[] args) {
		//创建FileReader对象，用来读取字符流
		FileReader fr=null;
		try {
			File poemFile=new File("src/com/intyt/io/poem.txt");
	        fr=new FileReader(poemFile);
	        while (fr.ready()) {
				char oneChar=(char)fr.read();
				System.out.println(oneChar);
			}
	        fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
