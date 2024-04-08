package com.practice.java.ds.binarytree.practice;

public class BSTDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.add(bst.head, new Node(10, null,null));
		bst.add(bst.head, new Node(12, null,null));
		bst.add(bst.head, new Node(8, null,null));
		bst.add(bst.head, new Node(7, null,null));
		
		bst.search(10, bst.head);
		

	}

}
