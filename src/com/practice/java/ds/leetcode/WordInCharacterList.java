package com.practice.java.ds.leetcode;

import java.util.HashMap;

public class WordInCharacterList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char []ch = {'q','b','o','o' ,'k' , 'f','t'};
		
		String word="foot11";
		
		System.out.println(wordSearch(ch, word));
		
		
		

	}

	private static boolean wordSearch(char[] ch, String word) {
		HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
		for(char c :ch)
		{
			hm.put(c, hm.getOrDefault(c, 0)+1);
			
		}
		
		
		for(char c : word.toCharArray())
		{
			if(!hm.containsKey(c) ||  hm.get(c) <= 0)
			{
				return false;
			}
			hm.put(c,hm.get(c)-1);
		}
		
		return true;
	}
	
	
	

}
