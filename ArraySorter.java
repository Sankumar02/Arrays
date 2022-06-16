package com.Task_26_04_22;

import java.util.Scanner;

public class ArraySorter {
	Scanner scArrayScanner = new Scanner(System.in);
	int ascending[];
	int descending[];
	DataStorage oStorage = new DataStorage();

	public void getTheArrayElements() {

		System.out.println("Enter the length of the Array");

		oStorage.setlengthOfArray(scArrayScanner.nextInt());

		System.out.println("Enter the elements of unsorted Array");
		int array[] = new int[oStorage.getlengthOfArray()];

		for (int index = 0; index < array.length; index++) {
			array[index] = scArrayScanner.nextInt();
		}

		oStorage.setunSortedArray(array);
		scArrayScanner.close();
		System.out.println("!!---------Result----------!!");
		System.out.println("Length of the array :" + oStorage.getlengthOfArray());
	}

	public void sortTheArrayInAscendingOrder() {

		ascending = oStorage.getunSortedArray();

		for (int row = 0; row < ascending.length; row++) {
			int temporary;
			for (int column = row + 1; column < ascending.length; column++) {
				if (ascending[row] > ascending[column]) {
					temporary = ascending[row];
					ascending[row] = ascending[column];
					ascending[column] = temporary;
				}
			}
		}
		oStorage.setArraySortedInAscendingOrder(ascending);
	}

	public void sortTheArrayInDescendingOrder() {

		descending = oStorage.getunSortedArray();

		for (int row = 0; row < descending.length; row++) {
			int temporary;
			for (int column = row + 1; column < descending.length; column++) {
				if (descending[row] < descending[column]) {
					temporary = descending[row];
					descending[row] = descending[column];
					descending[column] = temporary;
				}
			}
		}
		oStorage.setArraySortedInDescendingOrder(descending);
	}

	public void displayTheArraySortedInAscendingOrder() {
		System.out.println("Array sorted in Ascending order : ");
		ascending = oStorage.getArraySortedInAscendingOrder();
		for (int index = 0; index < ascending.length; index++) {
			System.out.print(ascending[index] + " ");
		}

	}

	public void displayTheArraySortedInDescendingOrder() {
		System.out.println();
		System.out.println("Array sorted in Descending order : ");
		descending = oStorage.getArraySortedInDescendingOrder();
		for (int index = 0; index < descending.length; index++) {
			System.out.print(descending[index] + " ");
		}
	}

}
