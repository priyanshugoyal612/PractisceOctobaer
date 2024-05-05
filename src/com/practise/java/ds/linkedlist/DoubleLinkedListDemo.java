package com.practise.java.ds.linkedlist;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList<String> list = new DoublyLinkedList<String>();
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
		System.out.println("**********");
		list.display();
		
		list.remove();
		list.remove();
		list.remove();
		list.remove();
		
		System.out.println("**********");
		list.display();
		

	}

}
