package com.practice.java.ds.queue;

public class MyQueue<X> {

	X[] data;
	int front;
	int rear;
	int size;

	public MyQueue(int size) {

		data = (X[]) new Object[size];
		/*
		 * for(int i=0;i<size-1;i++) { data[i] =(X) new Object(); }
		 */
		this.front = -1;
		this.rear = -1;
		this.size = size;
	}

	public boolean isEmpty() {

		return (front == -1 || front > rear);

	}

	public boolean isFull() {
		return (rear == size - 1);
	}

	public void queue(X item) {
		if (isFull()) {
			System.out.println("Queue is full and it can not be added");
			return;
		}
		rear = rear + 1;
		data[rear] = item;
		if(front==-1)
		{
			front=0;
		}

	}

	public X dequeue() {
		if (isEmpty()) {
			System.out.println("Nothing can be queued");
			return null;
		}
	
		X dat = data[front];
		front = front + 1;
		return dat;	

	}

}
