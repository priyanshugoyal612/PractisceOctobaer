package com.practise.java.ds.recurssion;

public class RecursionPracticesProblem1 {
	
	public static void main(String[] args) {
		
		/*
		 * 1
		 * 2 Codility 
		 * 3 Test 
		 * 4 Codility 
		 * 5 Coders 
		 * 6 CodilityTest 
		 * 7 
		 * 8 Codility 
		 * 9 Test 
		 * 10 CodilityCoders
		 */
		
		solution(30);
		
	}
	
	
	/**
	 * recursion way
	 * @param i
	 */
	static void solution(int i)
	{
		if(i<=0)
		{
			return;
		}
		solution(i-1);
		StringBuilder str= new StringBuilder();
		if(i%2==0)
		{
			str.append("Codility");
		}
		if(i%3==0)
		{
			str.append("Test");
		}
		if(i%5==0)
		{
			str.append("Coders");
		}
		if(str.length()==0)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println(str);
		}
		
	}

}
