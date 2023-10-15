package com.practice.java.ds.binarytree2;

public class BinarySerchTree2 {

	Node root;

	public BinarySerchTree2() {
		root = null;
	}

	public void add(Node start, Node newNode) {
		if (root == null) {
			root = newNode;
			return;
		}

		if (newNode.value > start.value) {

			add(start, newNode);

		}
		if (newNode.value < start.value) {
			add(start, newNode);
		}

	}

}
