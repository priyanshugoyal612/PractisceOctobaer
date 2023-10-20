package com.promblem.prodcon;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {

	public static void main(String[] args) {
		BlockingQueue<Integer> buffer = new ArrayBlockingQueue<Integer>(10);
		Thread producer = new Thread(new Producer(buffer));
		Thread consumer = new Thread(new Consumer(buffer));
		producer.start();
		consumer.start();

	}

}
