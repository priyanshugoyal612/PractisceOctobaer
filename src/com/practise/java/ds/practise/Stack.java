package com.practise.java.ds.practise;

public class Stack<Y> {
	
	Y data[];
	int stackPointer;
	int size;
	
	Stack(int size)
	{
		this.size=size;
		data= (Y[])new Object[size];
		stackPointer=0;
		
	}
	
	public int size()
	{
		return this.stackPointer;
	}
	
	public boolean isFull()
	{
		return stackPointer==size;
	}
	
	public boolean isEmpty()
	{
		return stackPointer==0;
	}
	
	public void push(Y value)
	{
		if(isFull())
		{
			System.out.println("Stack is full no space");
			return;
		}
		data[stackPointer++]= value;
	}
	
	public Y pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty nothing to pop");
			return null;
		}
		return data[--stackPointer];
	}

}
