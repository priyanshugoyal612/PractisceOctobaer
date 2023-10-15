package com.practice.java.ds.leetcode;

import java.util.HashMap;
import java.util.Map;


public class LeetCode13RomantoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="LVIII"; //
		String str2="III"; //3
		String str3="MCMXCIV"; //
		
		System.out.println(romanConvertor(str1));
		System.out.println(romanConvertor(str2));
		System.out.println(romanConvertor(str3));
		

	}
	
	
	public static int romanConvertor(String roman)
	{
		Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int result=0;
		for(int i=0;i<roman.length();i++)
		{
			if(i<roman.length()-1 && romanMap.get(roman.charAt(i)) < romanMap.get(roman.charAt(i+1)))
			{
				result-= romanMap.get(roman.charAt(i));
			}
			else
			{
				result+= romanMap.get(roman.charAt(i));
			}
		}
		
		return result;
		
	}

}
