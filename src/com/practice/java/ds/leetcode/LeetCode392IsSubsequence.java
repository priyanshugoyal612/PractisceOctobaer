package com.practice.java.ds.leetcode;

/**
 * A subsequence of a string is a new string that is formed from the original
 * string by deleting some (can be none) of the characters without disturbing
 * the relative positions of the remaining characters. (i.e., "ace" is a
 * subsequence of "abcde" while "aec" is not).
 * 
 * Example 1:
 * 
 * Input: s = "abc", t = "ahbgdc" Output: true 
 * Example 2:
 * 
 * Input: s = "axc", t = "ahbgdc" Output: false
 */
public class LeetCode392IsSubsequence {

	public static void main(String[] args) {

		System.out.println(isSubSequence("abc","ahbgdc"));
		System.out.println(isSubSequence("axc","ahbgdc"));

	}

	static boolean isSubSequence(String s, String t) {
		int index1 = 0;
		int index2 = 0;

		while (index1 <s.length()  && index2< t.length()) {

			if (s.charAt(index1) == t.charAt(index2)) {
				index1++;

			}
			index2++;

		}

		return index1 == s.length();

	}
}
