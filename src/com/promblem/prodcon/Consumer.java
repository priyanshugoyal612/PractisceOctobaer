package com.promblem.prodcon;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	public Consumer(BlockingQueue<Integer> buffer) {
		this.buffer = buffer;
	}

	BlockingQueue<Integer> buffer;

	@Override
	public void run() {
		
		try {
			for(int i=0;i<10;i++)
			{
			int value=buffer.take();
			System.out.println("Consuming Buffer "+ value);
			Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
