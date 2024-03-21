package com.practice.java.ds.leetcode;

import java.util.Stack;

public class LeetCode20ValidParenthesis {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (!stack.isEmpty() && ((ch == ')' && stack.peek() == '(') || (ch == '}' && stack.peek() == '{')
					|| (ch == ']' && stack.peek() == '['))) {
				stack.pop();
			} else {
				stack.push(ch);
			}

		}
		return stack.isEmpty();

	}

	public static void main(String args[]) {
		String inp1 = "{{()}}";
		String inp2 = "()";
		String inp3 = "}{}{";

		System.out.println(isValid(inp1));
		System.out.println(isValid(inp2));
		System.out.println(isValid(inp3));

	}
}
