package com.practice.java.ds.binarytree.practice;

public class MirrorTree {

	public static void main(String[] args) {
		MirrorTree mt = new MirrorTree();
		mt.buildTree();

	}
	
	
	  void buildTree()
	{
		//Tree 1
		Node node1 = new Node(1,null,null);
		Node node2 = new Node(2,null,null);
		Node node3 = new Node(3,null,null);
		Node node4 = new Node(4,null,null);
		Node node5 = new Node(5,null,null);
		
		node1.left=node3;
		node1.right=node2;
		
		node2.left=node5;
		node2.right=node4;
		
		explore1(node1);
		
		//Tree 2
			System.out.println();
				
				node1.left=node2;
				node1.right=node3;
				
				node2.left=node4;
				node2.right=node5;
				
				explore2(node1);
				
				
		
		
		//return null;
				
		
		
		
		
	}
	
	void explore1(Node node)
	{
		
		if(node!=null)
		{
			System.out.print(node.value +"\t");
			explore1(node.left);
			explore1(node.right);
		}
		
	}
	
	
	void explore2(Node node)
	{
		
		if(node!=null)
		{
			System.out.print(node.value +"\t");
			explore2(node.right);
			explore2(node.left);
			
		}
		
	}

}
