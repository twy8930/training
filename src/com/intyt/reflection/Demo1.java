package com.intyt.reflection;

/**
 * 反射演示
 * @author twy
 *
 */
public class Demo1 {
	
	public static void main(String[] args) {
		//获取包名和类名
		Demo1 demo=new Demo1();
        System.out.println(demo.getClass().getName());
        
        //三种获取class的方式
        Class<?> demo1=null;
        Class<?> demo2=null;
        Class<?> demo3=null;
        try{
            //一般尽量采用这种形式
            demo1=Class.forName("com.intyt.reflection.Demo1");
        }catch(Exception e){
            e.printStackTrace();
        }
        demo2=new Demo1().getClass();
        demo3=Demo1.class;
        System.out.println("类名称   "+demo1.getName());
        System.out.println("类名称   "+demo2.getName());
        System.out.println("类名称   "+demo3.getName());
    }

}
