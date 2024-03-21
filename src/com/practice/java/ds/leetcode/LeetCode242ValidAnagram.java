package com.practice.java.ds.leetcode;

import java.util.Arrays;

/**
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 */
public class LeetCode242ValidAnagram {
	
	 public static boolean isAnagram(String s, String t) {
		 char[] cs= s.toCharArray();
		 
		 char[] ct= t.toCharArray();
         Arrays.sort(cs);
         Arrays.sort(ct);
		 if(s.length()!=t.length())
		 {
			 return false;
		 }
		 for(int i =0;i< s.length();i++)
		 {
			 if(cs[i]!=ct[i])
			 {
				 return false;
			 }
		 }
		 
		 return true;
	 }
	        
	    

	public static void main(String[] args) {
		String s= "car";
		String t ="car";
		
		System.out.println(isAnagram(s, t));
	}

}
