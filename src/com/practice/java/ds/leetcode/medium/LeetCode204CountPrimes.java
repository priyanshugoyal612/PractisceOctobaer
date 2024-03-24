package com.practice.java.ds.leetcode.medium;

public class LeetCode204CountPrimes {

	public static int countPrimes(int n) {

		if (n <= 1) {
			return 0;
		}

		int count = 0;
		boolean[] primes = new boolean[n];

		for (int i = 2; i < n; i++) {
			primes[i] = true;

		}

		for (int i = 2; i * i < n; i++) {
			if (primes[i]) {

				for (int j = i * i; j < n; j += i) {
					primes[j] = false;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (primes[i])
				count++;
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println(countPrimes(10));
		System.out.println(countPrimes(0));
		System.out.println(countPrimes(1));

	}

}
