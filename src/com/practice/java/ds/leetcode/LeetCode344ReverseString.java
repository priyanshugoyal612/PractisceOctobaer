package com.practice.java.ds.leetcode;

import java.util.Arrays;

/**
 * 
 * Write a function that reverses a string. The input string is given as an
 * array of characters s.
 * 
 * You must do this by modifying the input array in-place with O(1) extra
 * memory.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = ["h","e","l","l","o"] Output: ["o","l","l","e","h"] Example 2:
 * 
 * Input: s = ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105 s[i] is a printable ascii character.
 * 
 */
public class LeetCode344ReverseString {
	
	 public static void reverseString(char[] s) {
	        
	        int len= s.length-1;
	        
	        int start=0;
	        while(start<len)
	        {
	        	char temp;
	        	
	        	temp=s[start];
	        	s[start]= s[len];
	        	s[len]=temp;
	        	
	        	start++;
	        	len--;
	        	
	        }
	        
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char [] s = {'h','e','l','l','o'};
		reverseString(s);
		Arrays.toString(s);
		System.out.println(Arrays.toString(s));

	}

}
