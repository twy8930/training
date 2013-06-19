package com.intyt.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter演示
 * @author twy
 *
 */
public class FileWriterDemo {
	
	public static void main(String[] args) {
		//创建FileReader对象，用来读取字符流
		FileReader fr=null;
		//创建FileWriter对象，用来写出字符流
		FileWriter fw=null;
		try {
			File inPoem=new File("src/com/intyt/io/poem.txt");
			File outPoem=new File("src/com/intyt/io/poem_out.txt");
	        fr=new FileReader(inPoem);
	        fw=new FileWriter(outPoem);
	        while (fr.ready()) {
				char oneChar=(char)fr.read();
				if(oneChar!='齐'){
					fw.write(oneChar);
				}
			}
	        fr.close();
	        fw.close();
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
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
