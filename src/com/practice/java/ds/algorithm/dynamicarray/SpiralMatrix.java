package com.practice.java.ds.algorithm.dynamicarray;

import java.util.ArrayList;
import java.util.Iterator;

public class SpiralMatrix {

	public static void main(String[] args) {

		int[][] array = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int input2[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		ArrayList<Integer> arrayList = new SpiralMatrix().printSpiral(input2);

		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

	}

	ArrayList<Integer> printSpiral(int[][] array) {

		ArrayList<Integer> spairalList = new ArrayList<Integer>();

		int firstRow = 0;
		int lastRow = array.length - 1;
		int firstCol = 0;
		int lastCol = array[0].length - 1;

		while (firstRow <= lastRow && firstCol <= lastCol) {

			// up
			for (int i = firstCol; i <= lastCol; i++) {

				spairalList.add(array[firstRow][i]);
			}
			firstRow++;

			for (int i = firstRow; i <= lastRow; i++) {
				spairalList.add(array[i][lastCol]);
			}
			lastCol--;

			if (firstCol <= lastCol) {
				for (int i = lastCol; i >= firstCol; i--) {
					spairalList.add(array[lastRow][i]);
				}
				lastRow--;
			}

			if (firstRow <= lastRow) {
				for (int i = lastRow; i > firstRow; i--) {
					spairalList.add(array[i][firstCol]);
				}
				firstCol++;
			}

		}
		return spairalList;

	}

}
