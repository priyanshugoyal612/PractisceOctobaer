package com.practice.java.ds.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * 387. First Unique Character in a String Solved Easy Topics Companies Given a
 * string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "leetcode" Output: 0 Example 2:
 * 
 * Input: s = "loveleetcode" Output: 2 Example 3:
 * 
 * Input: s = "aabb" Output: -1
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105 s consists of only lowercase English letters.
 * 
 */
public class LeetCode387FirstUniqueCharacterInStirng {

	public static int firstUniqChar(String s) {

		HashMap<Character, Integer> hm = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {

			int count = hm.getOrDefault(s.charAt(i), 0);
			count++;
			hm.put(s.charAt(i), count);
		}

		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(hm.get(ch)==1)
			{
				return i;
			}
		}
		
		return -1;

	}
	
	public static void main(String [] args)
	{
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("loveleetcode"));
		System.out.println(firstUniqChar("aabb"));
	}

}
