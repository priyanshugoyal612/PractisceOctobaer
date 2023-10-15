package com.practise.java.ds.practise;

public class Entry<X,Y> {

	X key;
	Y value;
	Entry next;
	
	public Entry() {
		this.next=null;
	}

	Entry(X key, Y value) {
		this.key = key;
		this.value = value;
		this.next = null;
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
