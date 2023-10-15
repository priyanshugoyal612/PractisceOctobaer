package com.practise.java.ds.stcak;

public class Stack<T> {

	T[] data;
	int size;
	int stackPointer;

	Stack(int capacity) {
		data = (T[]) new Object[capacity];
		size = capacity;
		stackPointer = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return stackPointer == 0;
	}

	public boolean isFull() {
		return this.stackPointer == this.size;
	}

	
	public void push(T item)
	{
		if(isFull())
		{
			System.out.println("Stack is full dont insert any things");
			return;
		}
		
		data[stackPointer++]= item;
		
	}
	
	public T pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty nothing to pop");
			return null;
		}
		
		return data[--stackPointer];
		
	}
	
	
}
