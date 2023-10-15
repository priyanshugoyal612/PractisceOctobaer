package com.practise.java.ds.hashmap;

public class HashMap<X, Y> {

	Entry<X, Y>[] data;
	int capacity;

	HashMap(int capacity) {
		this.capacity = capacity;
		data = new Entry[capacity];
		for (int i = 0; i < capacity; i++) {
			data[i] = new Entry();
		}

	}

	int calculateHash(X key) {
		return key.hashCode() % capacity;
	}

	void put(X key, Y value) {
		int hasCode = calculateHash(key);
		Entry<X, Y> newEntry = new Entry<X, Y>(key, value);
		Entry arrayValue = data[hasCode];
		newEntry.next = arrayValue.next;
		arrayValue.next = newEntry;

	}

	Y get(X key) {
		Y value = null;
		int hascode = calculateHash(key);
		Entry<X, Y> entry = data[hascode];
		while (entry != null) {
			if (entry.key == key) {
				value = entry.value;
				break;
			}
			entry=entry.next;
		}
		return value;
	}

}
