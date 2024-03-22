package com.practice.java.ds.leetcode;

import java.util.HashMap;


public class LeetCode13RomantoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stubO
		
		String str1="LVIII"; //
		String str2="III"; //3
		String str3="MCMXCIV"; //
		
		System.out.println( "LVIII 58 result ->"+romanConvertor(str1));
		System.out.println("III 3 result ->"+ romanConvertor(str2));
		System.out.println("MCMXCIV 1994 result->" +romanConvertor(str3));
		

	}
	
	
	public static int romanConvertor(String s)
	{
		 HashMap<Character ,Integer> hm = new HashMap<>();
	        hm.put('I',1);
	        hm.put('V', 5);
	        hm.put('X',10);
	        hm.put('L',50);
	        hm.put('C',100);
	        hm.put('D',500);
	        hm.put('M',1000);

	        //III
	        //IV
	        //VI

	        int result =0;
	        for(int i=0;i<s.length();i++)
	        {
	            int current =hm.get(s.charAt(i));
	             int next=0;
	            if(i+1<s.length())
	            {next = hm.get(s.charAt(i+1));}
	            if(current < next)
	            {
	                result =result-current;
	            }
	            else
	            {
	                result=result+current;
	            }


	        }

	        return result;
	}

}
