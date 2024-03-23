package com.practice.java.ds.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 41. First Missing Positive
Solved
Hard
Topics
Companies
Hint
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 

Constraints:

1 <= nums.length <= 105
 */
public class LeetCode40FirstMissingPositeveHard {
	
	
	
	public static int firstMissingPositive(int [] nums)
	{
		  Arrays.sort(nums);
	        int result=1;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]>0)
	            {

	                while(i<nums.length-1 && nums[i]==nums[i+1])
	                {
	                    i++;
	                }
	                if(nums[i]!=result)
	                {
	                    return result;
	                }

	                result++;


	            }

	        }
	    return result;
	        
	    
	}
	
	/**
	 *  No memory efficent
	 * @param nums
	 * @return 
	 */
	public static int firstMissingPositiveJava8(int[] nums) {
		
		List<Integer> array=Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> hashSet= array.stream().filter(x-> x>-1).collect(Collectors.toSet());
		int count=1;
		while(true)
		{
			if(!hashSet.contains(count))
			{
				return count;
			}
			count++;
		}
		
		
		
	}

	public static void main(String[] args) {
		int [] nums1 ={1,2,0};
		int [] nums2 ={3,4,-1,1};
		int [] nums3 ={7,8,9,11,12};
		System.out.println("Expecte 3 Actual " +firstMissingPositive(nums1));
		System.out.println("Expecte 2 Actual " + firstMissingPositive(nums2));
		System.out.println("Expecte 1 Actual " +firstMissingPositive(nums3));
;


	}

}
