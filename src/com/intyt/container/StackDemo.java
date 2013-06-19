package com.intyt.container;

import java.util.Stack;

/**
 * Stack演示
 * @author twy
 *
 */
public class StackDemo {

	public static void main(String[] args) {
		Stack<Object> stack=new Stack<Object>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		Object pop=stack.pop();
		System.out.println(pop);
		
		Object peek1=stack.peek();
		System.out.println(peek1);
		Object peek2=stack.peek();
		System.out.println(peek2);
		
		System.out.println(stack.isEmpty());
		
		System.out.println(stack.search(1));
	}
	
}
