package com.practice.java.ds.algorithm.dp;

public class ClimbingStairs {

	public static int climbStairs(int n) {

		if (n <= 1) {
			return 1;
		}

		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println("Ways for climbing the stairs 1 " + climbStairs(1));
		System.out.println("Ways for climbing the stairs 2 " + climbStairs(2));
		System.out.println("Ways for climbing the stairs 3 " + climbStairs(3));
		System.out.println("Ways for climbing the stairs 4 " + climbStairs(4));
		System.out.println("Ways for climbing the stairs 5 " + climbStairs(5));

	}

}
