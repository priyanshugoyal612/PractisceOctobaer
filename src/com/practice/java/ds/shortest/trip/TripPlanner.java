package com.practice.java.ds.shortest.trip;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TripPlanner {

	public static void main(String[] args) {
		int[][] grid = { { 1, 1, 1, 1, 0 }, { 0, 1, 0, 1, 0 }, { 0, 0, 1, 1, 0 }, { 0, 0, 1, 1, 0 },
				{ 0, 0, 0, 0, 1 } };
		
		print(grid);

		Queue<City> queue = new LinkedList<City>();
		
		move(grid, queue, 0, 0, null);

		while (!queue.isEmpty()) {
			City city = queue.poll();
			System.out.println(city.column + "==" + city.row);
			// right
			move(grid, queue, city.row+1, city.column + 1, city.listOfCities);

			// bottom
			move(grid, queue, city.row + 1, city.column, city.listOfCities);
		}

		System.out.println("No planeed");

	}

	private static void move(int[][] grid, Queue<City> queue, int row, int column, ArrayList<Integer> listOfCities) {

		if (row >= 0 && row < grid.length && column >= 0 && column < grid[0].length) {
			
			
			if (grid[row][column] == 1 && column == grid[0].length - 1) {
				listOfCities.add(column);
				System.out.println("Trip is planned successfully" + listOfCities);
				System.exit(0);

			}
		else if (grid[row][column] == 1) {

				queue.add(new City(row, column, listOfCities));
				grid[row][column] = -1;

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
