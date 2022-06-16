package com.Task_26_04_22;

public class Array {
	public static void main(String[] args) {
		int[] array = new int[5];

		for (int i = 0; i < array.length; i++) {
			array[i] = i * 10;
			System.out.println("a[" + i + "] is " + array[i]);
		}
		arrray(array);
	}

	public static void arrray(int myarray[]) {
		for (int i = 0; i < myarray.length; i++) {
			System.out.println(i + " is " + myarray[i]);
		}
	}
}
