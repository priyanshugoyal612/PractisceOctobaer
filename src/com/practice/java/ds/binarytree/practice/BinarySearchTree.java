package com.practice.java.ds.binarytree.practice;

public class BinarySearchTree {

	Node head;

	public BinarySearchTree() {
		head = null;
	}

	public void add(Node start, Node newNode) {
		if (head == null) {
			head = newNode;
			return;
		}
		
		if(start==null)
		{
			start=newNode;
			return;
		}
		
		if(newNode.value>start.value)
		{
			if(start.right==null)
			{
				start.right=newNode;
			}
			add(start.right,newNode);
		}
		
		if(newNode.value<start.value)
		{
			if(start.left==null)
			{
				start.left=newNode;
			}
			add(start.left,newNode);
		}
		
		
	}
	
	
	public void search(int value,Node start)
	{
		
		if(start==null)
		{
			System.out.println("Not found");
			
			return;
		}
		
		if(start.value==value)
		{
			System.out.println("Found enjoy the BST " +value);
			return;
		}
		
		if(start.value<value)
		{
			search(value,start.right);
		}
		
		if(start.value>value)
		{
			search(value,start.left);
		}
		
		
		
	}
}
