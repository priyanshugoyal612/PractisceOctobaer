package com.practice.java.ds.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Easy
Topics
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 * 
 */
public class LeetCode1TwoSumNumber {

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length;i++) {
			int complement = target - nums[i];
			if (hashmap.containsKey(complement))
				
			{
				return new int[] { hashmap.get(complement), i };
			}

			hashmap.put(nums[i], i);
		}
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int [] nums = {2,7,11,15};
		int target = 9;
		System.out.println("Result 1 :" +Arrays.toString(twoSum(nums, target)));
		
		
		int [] nums2 = {3,2,4};
		int target2 = 6;
		System.out.println("Result 1 :" +Arrays.toString(twoSum(nums2, target2)));
		
		int [] nums3 = {3,3};
		int target3 = 6;
		System.out.println("Result 1 :" +Arrays.toString(twoSum(nums3, target3)));
		

	}

}
