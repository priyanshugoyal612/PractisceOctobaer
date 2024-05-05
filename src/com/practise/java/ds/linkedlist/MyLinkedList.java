package com.practise.java.ds.linkedlist;


public class MyLinkedList<X> {

	Node<X> head;

	MyLinkedList() {
		this.head = null;
	}

	public void add(X value) {

		Node<X> node = new Node<X>(value, null);
		if (head == null) {
			this.head = node;
		}else {

		node.next = head;
		head = node;
		}
	}
	
	
	
	public void remove()
	{
		if (head == null) {
			return;
		}
		else {
		head= head.next;
		}
	}
	
	
	public void display() {
		Node next = head;
		while (next != null) {
			System.out.println(next.value);
			next = next.next;
		}
	}

}
