package com.intyt.classes;

/**
 * 接口演示
 * @author twy
 *
 */
public class JuniorStudent extends Person implements Student{

	@Override
	public void assignClass(int age) {
		if(age>7&&age<13){
			System.out.println("你应该去"+classLevel[age-8]+"年级");
		}
		
	}
	
	public static void main(String[] args) {
		JuniorStudent xiaoming=new JuniorStudent();
		xiaoming.age=8;
		xiaoming.name="小明";
		xiaoming.assignClass(xiaoming.age);
	}

}
