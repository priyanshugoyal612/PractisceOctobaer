package com.practice.java.ds.shortest.postoffice;

import java.util.LinkedList;
import java.util.Queue;

public class SortestPathToPostOffice {

	public static void main(String[] args) {

		int[][] grid = { { 1, 1, 1, 1, 0 }, { 0, 0, 0, 1, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 1, 0, 0 },
				{ 0, 0, 1, 9, 0 } };
		print(grid);

		Queue<Cell> queue = new LinkedList<Cell>();
		// set robot location
		move(grid, queue, 0, 0, 0);
		while (!queue.isEmpty()) {

			Cell botCell = queue.poll();
			// Top
			move(grid, queue, botCell.row - 1, botCell.column, botCell.distance + 1);
			// bottom
			move(grid, queue, botCell.row + 1, botCell.column, botCell.distance + 1);
			// left
			move(grid, queue, botCell.row, botCell.column - 1, botCell.distance + 1);
			// right
			move(grid, queue, botCell.row, botCell.column + 1, botCell.distance + 1);
		}
		System.out.println("There is no path");
	}

	public static void move(int[][] grid, Queue<Cell> queue, int row, int column, int distance) {
		if (row >= 0 && row < grid.length && column >= 0 && column < grid[0].length) {
			if (grid[row][column] == 1) {
				queue.add(new Cell(row, column, distance));
				grid[row][column] = -1;
			} else if (grid[row][column] == 9) {
				System.out.println("Path is found, Distance " + distance);
				System.exit(0);
			}
		}
	}

	public static void print(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}
}
