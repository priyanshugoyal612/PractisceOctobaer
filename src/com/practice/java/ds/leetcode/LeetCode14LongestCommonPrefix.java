package com.practice.java.ds.leetcode;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: strs = ["flower","flow","flight"] Output: "fl" Example 2:
 * 
 * Input: strs = ["dog","racecar","car"] Output: "" Explanation: There is no
 * common prefix among the input strings.
 * 
 * 
 * Constraints:
 * 
 * 1 <= strs.length <= 200 0 <= strs[i].length <= 200 strs[i] consists of only
 * lowercase English letters.
 */
public class LeetCode14LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) throws InterruptedException {
		long t1 = System.currentTimeMillis();
		System.out.println(t1);

		Arrays.sort(strs);

		String first = strs[0];
		String last = strs[strs.length - 1];
		int index = 0;
		//Thread.currentThread().sleep(100);;

		while (index < first.length() && index < last.length()) {
			if (first.charAt(index) != last.charAt(index)) {
				break;
			}
			index++;
		}

		long t2 = System.currentTimeMillis();
		System.out.println("Time Taken in ms " + (t2 - t1));
		return first.substring(0, index);

	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] strs = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(strs));
		
		String[] strs2 = {"dog","racecar","car"};
		System.out.println("Result "+longestCommonPrefix(strs2));
		

	}

}
