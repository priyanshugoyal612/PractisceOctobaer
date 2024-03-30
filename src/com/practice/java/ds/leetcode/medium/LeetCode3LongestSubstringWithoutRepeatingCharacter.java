package com.practice.java.ds.leetcode.medium;

import java.util.HashMap;

/**
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
 * length of 3. Example 2:
 * 
 * Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with the length
 * of 1. Example 3:
 * 
 * Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke", with the
 * length of 3. Notice that the answer must be a substring, "pwke" is a
 * subsequence and not a substring.
 * 
 * 
 * Constraints:
 * 
 * 0 <= s.length <= 5 * 104 s consists of English letters, digits, symbols and
 * spaces.
 */
public class LeetCode3LongestSubstringWithoutRepeatingCharacter {

	/**
	 * This is optimize we are checking everly letter and putting it occurenace in
	 * hasmap which is the longest then we compare it with max flag if we found the
	 * repeated we start with second character by assigning i to i=hm.get(ch); and
	 * clearing the hashmap.
	 * 
	 * @param s
	 * @return
	 */
	public static int intlengthOfLongestSubstring(String s) {

		int max = 0;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (!hm.containsKey(ch)) {
				hm.put(ch, i);

			} else {
				// checking the max = abcabcbb
				//supose we get the occurwance of a on index 4 then we are taking it max and we
				max = Math.max(hm.size(), max);
				// supose we get the occurwance of a on index 4 then we are taking it max and we
				// are reseting it index to be checking the another longest
				i = hm.get(ch);
				hm.clear();
			}

		}

		return Math.max(max, hm.size());

	}

	public static void main(String args[]) {
		String s1 = "abcabcbb";
		String s2 = "bbbbb";
		String s3 = "pwwkew";

		System.out.println("Longest Substring : " + intlengthOfLongestSubstring(s1));
		System.out.println("Longest Substring : " + intlengthOfLongestSubstring(s2));
		System.out.println("Longest Substring : " + intlengthOfLongestSubstring(s3));

	}

}
