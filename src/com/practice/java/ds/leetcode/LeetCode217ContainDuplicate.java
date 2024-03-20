package com.practice.java.ds.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 
 * 217. Contains Duplicate
Solved
Easy
Topics
Companies
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 
 
 Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 * 
 */
public class LeetCode217ContainDuplicate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1,1,1,3,3,4,3,2,4,2}; //true
		int[] nums2 = {1,2,3,1}; //true
		int[] nums3 = {1,2,3,4}; //false
		
		System.out.println(containsDuplicate(nums1));
		System.out.println(containsDuplicate(nums2));
		System.out.println(containsDuplicate(nums3));
		System.out.println(containsDuplicateFaster(nums1));
		System.out.println(containsDuplicateFaster(nums2));
		System.out.println(containsDuplicateFaster(nums3));
		

	}

	 public static boolean containsDuplicate(int[] nums) {

	     Arrays.sort(nums); 
	    int index=0;
	     while(index<nums.length-1)
	     {
	    	 if(nums[index]==nums[index+1])
	    	 {
	    		 return true;
	    	 }
	    	 index++;
	     }
	     return false;
	        
	    }
	
	
	
	 public static boolean containsDuplicateFaster(int[] nums) {

		 HashSet<Integer> hashset = new HashSet<Integer>();
		 
		 for(int num :nums)
		 {
			 if(hashset.contains(num))
			 {
				 return true;
			 }
			 hashset.add(num);
		 }
		  return false;
	        
	    }

}
