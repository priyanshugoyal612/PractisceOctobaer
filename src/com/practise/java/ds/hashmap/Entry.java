package com.practise.java.ds.hashmap;

public class Entry<X,Y> {
	
	 X key;
	 Y value;
	 
	 Entry next;
	 
	 Entry(X key, Y value)
	 {
		 this.key=key;
		 this.value=value;
		 next =null;
	 }

	public Entry() {
		next=null;
	}

	public X getKey() {
		return key;
	}

	public void setKey(X key) {
		this.key = key;
	}

	public Y getValue() {
		return value;
	}

	public void setValue(Y value) {
		this.value = value;
	}
	
	 

}
