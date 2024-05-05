package com.practise.java.ds.hashmap;

public class Entry1<X,Y> {

	
	X key;
	Y value;
	Entry1<X,Y> next;
	
	public Entry1() {
		this.next=null;
	}
	
	public Entry1(X key, Y value) {
		super();
		this.key = key;
		this.value = value;
		this.next=null;
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

	public Entry1<X, Y> getNext() {
		return next;
	}

	public void setNext(Entry1<X, Y> next) {
		this.next = next;
	}
}
