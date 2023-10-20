package com.promblem.prodcon;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	private BlockingQueue<Integer> buffer;
	
	Producer(BlockingQueue<Integer> blockingQueue)
	{
		this.buffer = blockingQueue;
	}

	@Override
	public void run() {
		
		try {
		for(int i =0;i< 10 ;i++)
		{
			System.out.println("Producing " + i);
		
				buffer.put(i);
				Thread.sleep(1000);
			
			
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
