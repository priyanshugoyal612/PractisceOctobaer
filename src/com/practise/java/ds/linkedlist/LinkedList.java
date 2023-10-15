package com.practise.java.ds.linkedlist;

public class LinkedList<X> {

	Node head;
	

	LinkedList() {
		this.head = null;
	}

	public void add(X item) {

		Node newNode = new Node<X>(item, null);
		if (head == null) {
			this.head = newNode;
		}
		else {

		newNode.nextNode = head;
		head = newNode;
		}

	}

	public void remove() {

		if (head == null) {
			return;
		}
		else {
		head = head.nextNode;
	}}
	
	
	public void display() {
		Node next = head;
		while (next != null) {
			System.out.println(next.value);
			next = next.nextNode;
		}
	}
	
	

	class Node<X> {
		X value;
		Node<X> nextNode;

		Node(X value, Node<X> nextNode) {
			this.value = value;
			this.nextNode = nextNode;
		}

	}

}