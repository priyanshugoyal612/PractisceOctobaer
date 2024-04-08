package com.practice.java.ds.binarytree;

public class BinaryTree {

	Node root;

	public BinaryTree() {
		root = null;
	}

	public void add(Node start, Node newNode) {
		if (this.root == null) {
			root = newNode;
			return;
		}
		if (start == null) {
			start = newNode;
		}
		if (newNode.value > start.value) {
			if (start.right == null) {
				start.right = newNode;
			}
			add(start.right, newNode);
		}
		if (newNode.value < start.value) {
			if (start.left == null) {
				start.left = newNode;
			}
			add(start.left, newNode);
		}

	}
	
	public void search(int value, Node start)
	{
		if(start==null)
		{
			System.out.println("Not found return");
			return;
		}
		if(value==start.value)
		{
			System.out.println("Value is found " + value);
			return;
		}
		if(value>start.value)
		{
			search(value, start.right);
		}
		if(value<start.value)
		{
			search(value,start.left);
		}

	}
}
