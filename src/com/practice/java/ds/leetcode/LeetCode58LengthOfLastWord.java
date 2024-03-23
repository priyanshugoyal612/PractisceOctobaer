package com.practice.java.ds.leetcode;

public class LeetCode58LengthOfLastWord {
	
	 public static int lengthOfLastWord(String s) {
	       s= s.trim();

	        String [] sts= s.split(" ");
	        return sts[sts.length-1].length();
	        
	    }

	public static void main(String[] args) {
		
		System.out.println(lengthOfLastWord("Hello World"));
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
		System.out.println(lengthOfLastWord("luffy is still joyboy"));
		
	}

}
