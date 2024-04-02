package com.practice.java.ds.shortest.trip;

import java.util.ArrayList;

public class City {

	public int row;
	public int column;
	public ArrayList<Integer> listOfCities;

	public City(int row, int column, ArrayList<Integer> listOfCities) {
		this.row = row;
		this.column = column;
		this.listOfCities = new ArrayList<Integer>();
		if (listOfCities != null) {
			this.listOfCities.addAll(listOfCities);

		}
		this.listOfCities.add(column);
	}

}
