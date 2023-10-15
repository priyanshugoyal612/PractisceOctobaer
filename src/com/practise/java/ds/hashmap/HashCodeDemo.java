package com.practise.java.ds.hashmap;

public class HashCodeDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer, String>(10);
		hm.put(1,"Priyanshu");
		hm.put(2,"Atharv");
		hm.put(3,"Neeraj");
		hm.put(4,"Nishant");
		
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		System.out.println(hm.get(5));
		hm.put(2,"Priyanshu");
		hm.put(3,"Atharv");
		hm.put(4,"Neeraj");
		hm.put(5,"Nishant");
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		System.out.println(hm.get(5));

	}

}
