package com.practice.java.ds.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 *  Intersection of two arrays
 *  Given two integer arrays nums1 and nums2, return an array of their intersection.
 *   Each element in the result must appear as many times as it shows in both arrays 
 *   and you may return the result in any order.Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 * @author priyanshu.goyal
 *
 */
public class LeetCodeProblem350 {

	public static void main(String[] args) {
		int [] nums1 = {1,2,2,1};
		int [] nums2 = {2,2};
		System.out.println(Arrays.toString(solution(nums1,nums2)));
		
		int [] nums3 = {4,9,5};
		int [] nums4 = {9,4,9,8,4};
		System.out.println(Arrays.toString(solution(nums3,nums4)));

	}
	
	public static int[] solution(int [] nums1 ,int [] nums2)
	{
		List<Integer> result = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int index1=0;
		int index2=0;
			String s ="shhs";
			//s.repl
		while(index1<nums1.length && index2<nums2.length)
		{
			if(nums1[index1]==nums2[index2])
			{
				result.add(nums1[index1]);
				index1++;
				index2++;
			}
			else if(nums1[index1]>nums2[index2])
			{
				index2++;
			}
			else
			{
				index1++;
			}
			
		
		}
		
		return result.stream().mapToInt(i->i).toArray();
		
	}

}
