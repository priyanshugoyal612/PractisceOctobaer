package com.practice.java.ds.leetcode;

public class LeetCode101SymmetricTree {

	/**
	 * @param args
	 */
	
	/**
	 * @param n
	 * @return
	 */
	public static boolean isPrime(int n)
	{
		
		if(n<=1 )
		{
			return false;
		}
		
		for(int i =2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
			
		}
		
		return true;
		
	}
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(isPrime(3));;
		System.out.println(isPrime(4));;
		System.out.println(isPrime(5));;
		System.out.println(isPrime(6));;
		System.out.println(isPrime(7));;
		System.out.println(isPrime(8));;
		System.out.println(isPrime(9));;
		System.out.println(isPrime(241));;
	
	
	
	
			
		

	}

}
