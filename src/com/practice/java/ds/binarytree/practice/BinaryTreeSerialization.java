package com.practice.java.ds.binarytree.practice;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeSerialization {
	
	
	public static void main(String[] args) {
		
		Node node1 = new Node(1, null, null);
		Node node2 = new Node(2, null, null);
		Node node3 = new Node(3, null, null);
		Node node4 = new Node(4, null, null);
		Node node5 = new Node(5, null, null);
		
		
		node1.left=node3;
		node1.right=node2;
		node2.left=node5;
		node2.right=node4;
		
		BinaryTreeSerialization bst = new BinaryTreeSerialization();
		
		String data =bst.serealaize(node1);
		System.out.println(data);
		
		Node treeNode =bst.deserealaize(data);
		

		
		
		String data2 =bst.serealaize(treeNode);
		System.out.println(data2);
		
		
		
		
		
		
		
	}
	
	
	public String serealaize(Node node)
	{
		if(node==null)
		{
			return null;
			
		}
		StringBuilder sb = new StringBuilder();
		
	 serealaizeHelper(node, sb);
	 return sb.toString();
		
		
		
	}
	
	public void serealaizeHelper(Node node, StringBuilder sb)
	{
		if(node==null)
		{
			sb.append("null").append(",");
			return ;
		}
		
		sb.append(node.value).append(",");
		serealaizeHelper(node.left, sb);
		serealaizeHelper(node.right, sb);
			
	}
	
	
	public Node deserealaize(String data)
	{
		if(data==null || data.equals("null"))
		{
			return null;
		}
		
		Queue<String> queue = new LinkedList<String>(Arrays.asList(data.split(",")));
		return deserealaizeHelper(queue);
	}

	private Node deserealaizeHelper(Queue<String> queue) {
		
		String val = queue.poll();
		if(val.equals("null"))
		{
			return null;
		}
			
		Node newNode = new Node(Integer.parseInt(val), null,null);
		newNode.left=deserealaizeHelper(queue);
		newNode.right=deserealaizeHelper(queue);
		
			return newNode;
			
		
	}


}
