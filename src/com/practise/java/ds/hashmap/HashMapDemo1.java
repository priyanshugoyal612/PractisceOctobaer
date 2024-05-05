package com.practise.java.ds.hashmap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap1< Integer,String> hm = new HashMap1<Integer, String>(10);
		hm.put(1,"Priyanshu");
		hm.put(2,"Apoorava");
		hm.put(3,"Atharv");
		hm.put(1,"Shivanshu");
		System.out.println(hm.get(1));

	}

}
