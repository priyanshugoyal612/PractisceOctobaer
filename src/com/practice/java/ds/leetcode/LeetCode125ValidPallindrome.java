package com.practice.java.ds.leetcode;

public class LeetCode125ValidPallindrome {
	
	 /**
	 * @param s
	 * @return
	 */
	public static boolean isPalindrome(String s) {

		 	s= s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
		 	boolean ispallindrome=true;
		 	int start =0;
		 	int end=s.length()-1;
		 	while(start<end)
		 	{
		 		if(s.charAt(end)!=s.charAt(start))
		 		{
		 			return false;
		 		}
		 		start++;
		 		end--;
		 	}
		 			 	
	    return ispallindrome;

	        
	    }
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		
	}
}
