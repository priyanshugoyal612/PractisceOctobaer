package com.practise.java.ds.practise;

public class HashMap<X, Y> {

	Entry[] data;
	int size;

	public HashMap(int size) {
		this.size = size;
		data = new Entry[size];
		for (int i = 0; i < data.length; i++) {
			data[i] = new Entry();
		}

	}

	int calculateHash(X key) {
		return key.hashCode() % size;
	}

	public void put(X key, Y value) {
		int hashCode = calculateHash(key);
		Entry<X, Y> newEntry = new Entry<>(key, value);
		Entry<X, Y> arrayValue = data[hashCode];
		newEntry.next = arrayValue.next;
		arrayValue.next = newEntry;
	}

	public Y get(X key) {
		Y value = null;
		int hashCode = calculateHash(key);
		Entry next = data[hashCode];

		while (next != null) {
			if (next.key==(key)) {
				value = (Y) next.getValue();
				break;
			}
			next=next.next;
		}

		return value;
	}

}
