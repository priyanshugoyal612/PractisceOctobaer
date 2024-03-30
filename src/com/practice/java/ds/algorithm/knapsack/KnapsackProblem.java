package com.practice.java.ds.algorithm.knapsack;

/**
 * 
 */
public class KnapsackProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] set= {1,5,6,9,10};
		
		int myBasket= 15;
		
		
		
		
		//Solution
		//Posibilities 2 ^5;
		//how to get these posibilities
		//this loop will genrate all the posible scenario 2^5 =32 scenarios
		for(int i=0; i < (1<< set.length);i++)
		{
			String packet ="";
			int sum =0;
			for(int j=0; j<set.length;j++)
			{
				
				//System.out.println(Integer.toBinaryString(1<<j));
				if((i & (1 << j))>0)
				{
					packet=packet+ set[j] +" ";
					sum=sum+set[j];
				}

				
			}
			if(sum==myBasket)
				System.out.println(packet);
		}
		
		
		
		
		
		
		

	}

}
