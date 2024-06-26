package com.practice.java.ds.leetcode;

/**
 * 
 * 28. Find the Index of the First Occurrence in a String Solved Easy Topics
 * Companies Given two strings needle and haystack, return the index of the
 * first occurrence of needle in haystack, or -1 if needle is not part of
 * haystack.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: haystack = "sadbutsad", needle = "sad" Output: 0 Explanation: "sad"
 * occurs at index 0 and 6. The first occurrence is at index 0, so we return 0.
 * Example 2:
 * 
 * Input: haystack = "leetcode", needle = "leeto" Output: -1 Explanation:
 * "leeto" did not occur in "leetcode", so we return -1.
 * 
 * 
 * Constraints:
 * 
 * 1 <= haystack.length, needle.length <= 104 haystack an
 */
public class LeetCode28FindTheIndexOfTheFirstOccurrenceInAString {

	public static int strStr(String haystack, String needle) {

		if (needle.equals(haystack)) {
			return 0;
		}

		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			if (haystack.substring(i, i + needle.length()).equals(needle)) {
				return i;
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		String hayStack1 = "sadbutsad";
		String needle1 = "sad";

		System.out.println(strStr(hayStack1, needle1));

		
		String hayStack2 = "leetcode";
		String needle2 = "leeto";

		System.out.println(strStr(hayStack2, needle2));
		
		String hayStack3 = "a";
		String needle3 = "a";

		System.out.println(strStr(hayStack3, needle3));
		
	}

}
