package com.intyt.string;

/**
 * 字符串常用操作
 * 
 * @author twy
 * 
 */
public class CommonUse {

	// 字符串比较
	public static void compare() {
		String s1 = "a";
		String s2 = "A";
		// 检查是否完全一致
		s1.equals(s2);
		// 检查是否一致(忽略大小写)
		s1.equalsIgnoreCase(s2);
		// 按顺序检查每个字符的ascii值，遇到不同时马上返回差值
		s1.compareTo(s2);
		// 按顺序检查每个字符的ascii值，遇到不同时马上返回差值(忽略大小写)
		s1.compareToIgnoreCase(s2);
	}

	// 判断一个字符串中是否包含另外一个字符串
	public static void contains() {
		String string = "Madam, I am Adam";
		//检查是否以子串开始
		string.startsWith("Mad"); 
		// 检查是否以子串结束
		string.endsWith("dam"); 
		//检查第一个匹配的子串的位置，不包含返回-1
		string.indexOf("I am");
		//返回最后一个子串的位置
		string.lastIndexOf("m");
		//检查是否包含子串
		string.contains("dam");
	}
	
	//获取字符串中的子串
	public static void substring(){
		String string = "Madam, I am Adam";
		//返回指定位置的字符
		string.charAt(5);
		//返回指定的子串
		string.substring(0,3);
	}
	
	public static void other(){
		String string = "Madam, I am Adam";
		//获取长度
		string.length();
		//转换成字节
		string.getBytes();
		//去前后空格
		string.trim();
		//转换成小写
		string.toLowerCase();
		//转换成大写
		string.toUpperCase();
		//替换字符串
		string=string.replace("Madam","Boy");
		//全部替换
		string=string.replaceAll("Madam","Boy");
		//分隔字符串
		string.split("m");
		//将其它数据类型转换为String
		string.valueOf("");
		//格式化输出
		string.format("%s,hellp", "Tom");
	}

}
