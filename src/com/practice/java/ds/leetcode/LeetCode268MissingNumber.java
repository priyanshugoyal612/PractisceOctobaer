package com.practice.java.ds.leetcode;

import java.util.Arrays;

public class LeetCode268MissingNumber {

	public static void main(String[] args) {

		int[] nums1 = { 3, 0, 1 };
		int[] nums2 = { 0, 1 };
		int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };

		System.out.println("Expected 2 Actual " + missingNumberJava8(nums1));
		System.out.println("Expected 2 Actual " + missingNumberJava8(nums2));
		System.out.println("Expected 8 Actual " + missingNumberJava8(nums3));

		System.out.println("Expected 2 Actual " + missingNumber(nums1));
		System.out.println("Expected 2 Actual " + missingNumber(nums2));
		System.out.println("Expected 8 Actual " + missingNumber(nums3));

	}

	public static int missingNumber(int[] nums) {

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != i) {
				return i;
			}

		}

		return nums.length;
	}

	public static int missingNumberJava8(int[] nums) {
		int expectedSum = (nums.length * (nums.length + 1)) / 2;
		int actualSum = Arrays.stream(nums).sum();
		return expectedSum - actualSum;

	}
}