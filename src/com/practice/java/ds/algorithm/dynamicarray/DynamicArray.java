package com.practice.java.ds.algorithm.dynamicarray;

import java.util.Arrays;

public class DynamicArray<X> {

	X[] data;
	int size;

	public DynamicArray() {
		size = 0;
		data = (X[]) new Object[1];

	}
		
	
	public int getSize()
	{
		return data.length;
		
	}
	
	
	public X get(int index)
	{
		return data[index];
	}
	
	public void put(X element)
	{
	ensureCapacity(size+1);
		data[size++] =element;
	}
	
	
	public void ensureCapacity(int min)
	{
		
		int oldCapacity= getSize();
		if(min>oldCapacity)
		{
			int newCapacity= oldCapacity*2;
			if(newCapacity<min)
				newCapacity=min;
			data= Arrays.copyOf(data, newCapacity);
		}
		
	}
	
	
	
	
}
