package com.practice.java.ds.algorithm.dp;

public class FibonacciSeries {

	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}

		int dp[] = new int[n + 1];

		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	
	
	public static int fib(int n) {
        if (n <= 1)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

	public static void main(String[] args) {

		System.out.println("Fibcoaniyeserices for n 25 " + fibonacci(10));
		System.out.println("Fibcoaniyeserices for n 25 " + fib(10));
	}
}
