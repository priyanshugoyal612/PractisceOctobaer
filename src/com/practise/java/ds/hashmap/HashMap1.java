package com.practise.java.ds.hashmap;

public class HashMap1<X,Y> {
	
	Entry1[] data;
	int size;

	public HashMap1(int size) {
		super();
		this.size=size;
		this.data = new Entry1[size];
		
		for(int i=0;i<size;i++)
		{
			data[i]= new Entry1<X, Y>();
		}
	}
	
	public int calculateHash(X key)
	{
		return key.hashCode()%size;
	}
	
	public void put(X key, Y value)
	{
		int hashKey= calculateHash(key);
		Entry1<X,Y> entry=this.data[hashKey];
		Entry1<X,Y> newEntry= new Entry1<X, Y>(key, value);
		newEntry.next= entry.next;
		entry.next=newEntry;
		
		
	}
	
	public Y get(X key)
	{
		Y value=null;
		int hashKey= calculateHash(key);
		Entry1<X,Y> entry=this.data[hashKey];
		
		while(entry!=null)
		{
			if(entry.getKey()==(key))
			{
				return entry.value;
			}
			entry= entry.next;
		}
		return value;
		
	}
	
	
	

}
