package com.intyt.generics;

/**
 * 泛型无法向上转型
 * @author twy
 *
 */
public class GenericsDemo04{  
    public static void main(String args[]){  
        Info<String> i1 = new Info<String>() ;      // 泛型类型为String  
        Info<Object> i2 = null ;  
//        i2 = i1 ;                               //这句会出错 incompatible types  
    }  
}
