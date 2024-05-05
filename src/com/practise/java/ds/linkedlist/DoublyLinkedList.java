package com.practise.java.ds.linkedlist;

public class DoublyLinkedList<X> {

	NodeD<X> head;

	public DoublyLinkedList() {
		head=null;
	}

	public void add(X value) {
		NodeD<X> newNode = new NodeD<X>(value, null, null);

		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
	}

	public void remove() {

		if (head == null) {
			return;
		} else {
			head = head.next;
			 if (head != null)
			head.previous = null;
		}
	}
	
	
	public void display()
	{	
		NodeD next = head;
		
		while(next!=null)
		{
			System.out.println(next.value);
			next= next.next;
		}
		
	}

	public class NodeD<X> {

		X value;
		NodeD<X> next;
		NodeD<X> previous;

		public NodeD(X value, NodeD next, NodeD previous) {
			this.value = value;
			this.next = next;
			this.previous = previous;

		}
	}

}
