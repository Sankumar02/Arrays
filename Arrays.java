package com.Task_26_04_22;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		int[] myIntger = getIntegers(5);
		int[] sorted = sortIntegers(myIntger);
		printArray(sorted);
	}

	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Emter " + capacity + "intger values:");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		return array;

	}

	public static void printArray(int arrar[]) {
		for (int i = 0; i < arrar.length; i++) {
			System.out.println("Elements " + i + " int values" + arrar[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		int[] sortArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			sortArray[i] = array[i];
		}
		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortArray.length - 1; i++) {
				// if (sortArray[i] < sortArray[i + 1]) {//descending
				if (sortArray[i] > sortArray[i + 1]) {// ascending
					temp = sortArray[i];
					sortArray[i] = sortArray[i + 1];
					sortArray[i + 1] = temp;
					flag = true;
				}
			}
		}
		return sortArray;
	}
}
