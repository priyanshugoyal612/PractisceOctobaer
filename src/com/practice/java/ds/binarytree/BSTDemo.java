package com.practice.java.ds.binarytree;

public class BSTDemo {
	
	public static void main(String[] args) {
		
		BinaryTree bst = new BinaryTree();
		
		bst.add(bst.root, new Node(10, null,null));
		bst.add(bst.root, new Node(12, null,null));
		bst.add(bst.root, new Node(8, null,null));
		bst.add(bst.root, new Node(7, null,null));
		
		bst.search(1, bst.root);
	}

}
