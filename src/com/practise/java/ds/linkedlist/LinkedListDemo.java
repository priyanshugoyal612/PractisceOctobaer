package com.practise.java.ds.linkedlist;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		java.util.LinkedList<String> pr	= new java.util.LinkedList<String>();
		pr.add("Ram");
		pr.add("shyam");
		pr.add("trya");
		
		System.out.println(pr.get(0))
		;
	
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Priyanhsu");
		list.add("Shivanshu");
		list.add("Himanshu");
		list.add("Divyanshu");
		list.add("Shudanshu");
		list.add("Priyanhsu");
		list.display();
		
		list.remove();
		list.remove();
		list.remove();
		list.remove();
		System.out.println(" **********");
		list.display();
		
		list.remove();
		list.remove();
		list.remove();
		list.remove();
		
		System.out.println(" **********");
		list.display();
		
	}

}
