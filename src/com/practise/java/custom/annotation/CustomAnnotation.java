package com.practise.java.custom.annotation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CustomAnnotation {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Tiago tiago = new Tiago();
		
		Class className=tiago.getClass();
		SuperCar superCar=(SuperCar)className.getAnnotation(SuperCar.class);
		
		System.out.println(superCar.brandName());
		System.out.println(superCar.price());
		
		List<String> listA = Arrays.asList("Priyanshu","Goyal");
		Stream<String> strream = listA.stream();
		strream.forEach(System.out::println);
		//strream.forEach(System.out::println);
		
		
	}

}
