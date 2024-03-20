package com.practice.java.ds.leetcode;

import java.util.Arrays;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return
 * the only number in the range that is missing from the array.
 */
public class LeetCode268MissingNumber {

	public static void main(String[] args) {

		int[] nums1 = { 3, 0, 1 };
		int[] nums2 = { 0, 1 };
		int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

		System.out.println("Expected 2 Actual 2ms" + missingNumberJava8(nums1));
		System.out.println("Expected 2 Actual " + missingNumberJava8(nums2));
		System.out.println("Expected 8 Actual " + missingNumberJava8(nums3));

		System.out.println("Expected 2 Actual 5 ms" + missingNumber(nums1));
		System.out.println("Expected 2 Actual " + missingNumber(nums2));
		System.out.println("Expected 8 Actual  " + missingNumber(nums3));

		System.out.println("Expected 2 Actual  Fatser 0 ms " + missingNumberFaster(nums1));
		System.out.println("Expected 2 Actual " + missingNumberFaster(nums2));
		System.out.println("Expected 8 Actual " + missingNumberFaster(nums3));

	}

	/**
	 * 5 millisecond
	 * 
	 * @param nums
	 * @return
	 */
	public static int missingNumber(int[] nums) {

		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != i) {
				return i;
			}
		}

		return nums.length;
	}

	/**
	 * 2 millisecond
	 * 
	 * @param nums
	 * @return
	 */
	public static int missingNumberJava8(int[] nums) {
		int expectedSum = (nums.length * (nums.length + 1)) / 2;
		int actualSum = Arrays.stream(nums).sum();
		return expectedSum - actualSum;

	}

	/**
	 * 0 millissecond
	 * 
	 * @param nums
	 * @return
	 */
	public static int missingNumberFaster(int[] nums) {
		int expectedSum = (nums.length * (nums.length + 1)) / 2;
		int actualSum = 0;
		for (int num : nums) {
			actualSum += num;
		}
		return expectedSum - actualSum;

	}

}