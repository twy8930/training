package com.intyt.jvm;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 强、软、弱、虚引用示例
 * @author twy
 *
 */
public class Ref {
	
	public Ref() {
		
    }

    public static void main(String[] args) {
        try {
//            test1();
//            test2();
//            test3();
            test4();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /** 
     * 强引用
     * */  
    public static void test1() throws InterruptedException {  
        Object obj = new Object();  
        Object strong = obj;  
        obj = null;  
        System.gc();  
        Thread.sleep(1000);  
        System.out.println("strong="+strong);
    }  
    
    /** 
     * 软引用
     * */  
    public static void test2() throws InterruptedException {  
        Object obj = new Object();  
        SoftReference<Object> sr = new SoftReference<Object>(obj);  
        obj = null; 
        System.gc();  
        Thread.sleep(1000);  
        System.out.println("sr.get()="+sr.get()); 
        try{
        	byte[] bytes=new byte[64*1024*1024];
        }catch(Exception e){
        	e.printStackTrace();
        } finally{
            System.out.println("sr.get()="+sr.get());  
        }
    }  
    
    /** 
     * 弱引用
     * */  
    public static void test3() throws InterruptedException {  
        Object obj = new Object();  
        WeakReference<Object> wr = new WeakReference<Object>(obj);  
        obj = null;  
        System.gc();  
        Thread.sleep(1000);  
        System.out.println("wr.get()="+wr.get());  
    }  
    
    private static ReferenceQueue<String> rq = new ReferenceQueue<String>();
    
    /** 
     * 虚引用
     * */  
    public static void test4() throws InterruptedException {  
        String name = new String();  
        PhantomReference<String> pr = new PhantomReference<String>(name, rq);  
        System.out.println("pr.get()="+pr.get()); 
        System.out.println("pr.isEnqueued():"+pr.isEnqueued());
        name=null;
        System.gc();
        System.out.println("pr.isEnqueued():"+pr.isEnqueued());
        Reference<? extends String> inq = rq.poll(); 
        if(inq!=null){  
        	System.out.println("In queue:"+inq.get());  
        }
    } 
    
}
