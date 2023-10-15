package com.practise.java.ds.practise;

public class LinkedList<Y> {

	Node<Y> head;

	public LinkedList() {
		this.head = null;
	}
	
	public void add(Y value)
	{
		Node newNode= new Node<Y>(value);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		
	}
	
	
	
	public void remove()
	{
		if(head!=null)
		head=head.next;
	}
	
	public void display() {
		
		Node next = head;
		while(next!=null)
		{
			System.out.println(next.value);
			next=next.next;
		}
		
		
	}

	class Node<Y> {
		Y value;
		Node next;

		Node(Y value) {
			this.value = value;
			next = null;

		}

	}

}
