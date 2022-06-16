package com.Task_26_04_22;

public class DataStorage {

	private int lengthOfTheArray;
	private int unSortedArray[];
	private int arraySortedInAscendingOrder[];
	private int arraySortedInDescendingOrder[];

	public int getlengthOfArray() {
		return lengthOfTheArray;
	}

	public void setlengthOfArray(int length) {
		this.lengthOfTheArray = length;
	}

	public int[] getunSortedArray() {
		return unSortedArray;
	}

	public void setunSortedArray(int[] unSortedArray) {
		this.unSortedArray = unSortedArray;
	}

	public int[] getArraySortedInAscendingOrder() {
		return arraySortedInAscendingOrder;
	}

	public void setArraySortedInAscendingOrder(int[] arraySortedInAscendingOrder) {
		this.arraySortedInAscendingOrder = arraySortedInAscendingOrder;
	}

	public int[] getArraySortedInDescendingOrder() {
		return arraySortedInDescendingOrder;
	}

	public void setArraySortedInDescendingOrder(int[] arraySortedInDescendingOrder) {
		this.arraySortedInDescendingOrder = arraySortedInDescendingOrder;
	}
}
