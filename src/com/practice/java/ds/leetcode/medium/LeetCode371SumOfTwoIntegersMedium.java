package com.practice.java.ds.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given two integers a and b, return the sum of the two integers without using the operators + and -.

 

Example 1:

Input: a = 1, b = 2
Output: 3
Example 2:

Input: a = 2, b = 3
Output: 5
 

Constraints:

-1000 <= a, b <= 1000
 */
public class LeetCode371SumOfTwoIntegersMedium {
	
	 public static int getSum(int a, int b) {
		 
		 if(b==0)
		 {
			 return a;
		 }
		 
		 int carry= a ^b;
		 int sum = (a&b) <<1;
		 
		 return getSum(carry,sum);
		 
			/*
			 * List<Integer> list= Arrays.asList(a,b); int
			 * result=list.stream().mapToInt(Integer::intValue).sum(); return result;
			 */
	        
	    }

	public static void main(String[] args) {
		System.out.println(getSum(10,3));

	}

}
