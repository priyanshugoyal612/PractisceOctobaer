package com.practice.java.ds.queue;

import java.util.Arrays;

public class DynamicQueue<X> {

	X[] data;
	int front;
	int rear;
	int size;

	public DynamicQueue(int size) {

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
		ensureCapacity(rear + 2);

		rear = rear + 1;
		data[rear] = item;
		if (front == -1) {
			front = 0;
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

	public void ensureCapacity(int minCapacity) {
		int oldCapacity = size;
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity) {
				newCapacity = minCapacity;
			}

			data = Arrays.copyOf(data, newCapacity);
		}

	}

	public int getSize() {
		return data.length;
	}

}
