package com.practise.java.ds.practise;

public class LinkedListDemo {
	
	public static void main(String[] args) {
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
