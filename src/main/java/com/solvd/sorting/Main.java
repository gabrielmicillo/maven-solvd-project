package com.solvd.sorting;

public class Main {
	public static void main(String[] args) {
		QuicksortAsc disorganizedArray = new QuicksortAsc();
		int[] arr = { 5, 7, 6, 9, 4, 8 };
		int length = arr.length;
		System.out.println("Disorganized array: ");
		disorganizedArray.printArray(arr, length);
		disorganizedArray.quickSortAsc(arr, 0, length - 1);
		System.out.println("Organized array: ");
		disorganizedArray.printArray(arr, length);
	}
}
