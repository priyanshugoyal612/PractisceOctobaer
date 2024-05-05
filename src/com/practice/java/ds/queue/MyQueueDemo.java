package com.practice.java.ds.queue;

public class MyQueueDemo {

	public static void main(String[] args) {
				MyQueue<Integer> queue = new MyQueue<Integer>(3);
				queue.queue(10);
				queue.queue(5);
				queue.queue(9);
				queue.queue(8);
				System.out.println(queue.dequeue());
				System.out.println(queue.dequeue());
				System.out.println(queue.dequeue());
				System.out.println(queue.dequeue());
				System.out.println(queue.dequeue());
				

	}

}
