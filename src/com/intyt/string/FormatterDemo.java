package com.intyt.string;

import java.util.Formatter;

/**
 * 格式化输出演示
 * @author twy
 *
 */
public class FormatterDemo {
	
	public static void main(String[] args) {
		Formatter f=new Formatter(System.out);
		//默认右对齐，-改为左对齐，[width]控制宽度，[.precision]控制精度
		f.format("%-15s %5s %10s\n", "Item","Qty","Price");
		f.format("%-15s %5s %10s\n", "----","---","-----");
		
		f.format("%-15s %5d %10.2f\n", "Apple",1,5.00);
		f.format("%-15.15s %5d %10.2f\n", "Banana",2,20.00);
		f.format("%-15s %5d %10.2f\n", "Peach",5,50.00);
		
		f.format("%-15s %5s %10s\n", "","","-----");
		f.format("%-15s %5s %10.2f\n", "Total","",75.00);
	}

}
