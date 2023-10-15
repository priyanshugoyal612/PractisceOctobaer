package com.practise.java.ds.practise;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>(2);
		stack.push("Priyanshu");
		stack.push("Shivanshu");
		stack.push("Shivanshu");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.toString());

	}

}
