package com.practice.java.ds.queue;

public class DynamicQueueDemo {

	public static void main(String[] args) {
		DynamicQueue<Integer> dynamicQ = new DynamicQueue<Integer>(2);
		dynamicQ.queue(2);
		dynamicQ.queue(12);
		System.out.println("Suze" +dynamicQ.getSize());
		dynamicQ.queue(11);
		System.out.println("Suze" +dynamicQ.getSize());
		dynamicQ.queue(13);
		dynamicQ.queue(14);
		System.out.println("Suze" +dynamicQ.getSize());
		

	}

}
