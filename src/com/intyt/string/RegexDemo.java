package com.intyt.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则演示
 * @author twy
 *
 */
public class RegexDemo {
	
	public static void checkEmail(String email){
		//构造一个模式
		Pattern pattern=Pattern.compile("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");
		//构造一个匹配器
		Matcher matcher=pattern.matcher(email);
		//对整个字符串进行匹配,只有整个字符串都匹配了才返回true
		boolean isMatch = matcher.matches();
		//对字符串进行匹配,匹配到的字符串可以在任何位置
//		boolean isMatch = matcher.find();
		//对前面的字符串进行匹配,只有匹配到的字符串在最前面才返回true
//		boolean isMatch = matcher.lookingAt();
		if(isMatch){
			System.out.println("邮箱格式合法");
		}else{
			System.out.println("邮箱格式不合法");
		}
	}
	
	public static void replaceDemo(){
		Pattern pattern=Pattern.compile("\\d+");
		String content="sad dafsd  23 dsaf 244,fadfas sfsa $8assa asfas990.";
		System.out.println(content);
		Matcher matcher=pattern.matcher(content);
		String result="";
//		result=matcher.replaceAll("");
		result=matcher.replaceFirst("");
		System.out.println(result);
	}
	
	/**
	 *  在正则表达式中
		()定义了一个组,由于一个正则表达式可以包含很多的组,所以下面先说说怎么划分组的,
		以及这些组和组的下标怎么对应的.
		下面我们看看一个小例子,来说明这个问题
		引用
		\w(\d\d)(\w+)		
		这个正则表达式有三个组:
		整个\w(\d\d)(\w+) 是第0组 group(0)
		(\d\d)是第1组 group(1)
		(\w+)是第2组 group(2)
		我们看看和正则表达式匹配的一个字符串x99SuperJava，
		group(0)永远都是匹配整个表达式的字符串的那部分x99SuperJava
		group(1)是第1组(\d\d)匹配的部分:99
		group(2)是第二组(\w+)匹配的那部分SuperJava
	 */
	public static void groupDemo(){
		Pattern pattern=Pattern.compile("\\w(\\d\\d)(\\w+)");
		String content="x99SuperJava";
		Matcher matcher=pattern.matcher(content);
		if(matcher.find()){  
			int count = matcher.groupCount();  
	        for(int i = 0; i <= count; i++)  
	        	System.out.println("group " + i + " :" + matcher.group(i));  
	    }  
	}
	
	public static void main(String[] args) {
	}

}
