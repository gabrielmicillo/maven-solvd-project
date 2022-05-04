package com.solvd.sorting;

import java.util.Scanner;

public class SortMenu {
	public void menu() {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Send 1 if you want to sort an array of NUMBERS on ASCENDING way.");
			System.out.println("Send 2 if you want to sort an array of NUMBERS on DESCENDING way.");
			System.out.println("Send 3 if you want to sort an array of LETTERS on ASCENDING way.");
			System.out.println("Send 4 if you want to sort an array of LETTERS on DESCENDING way.");
			int choice = input.nextInt();

			if (choice == 1) {
				System.out.println("You chose NUMBERS on ASCENDING way.");
				QuicksortAsc disorganizedArray = new QuicksortAsc();
				System.out.println("Enter the size of the array (number of elements)");
				int size = input.nextInt();
				int[] arr = new int[size];
				for (int i = 0; i < size; i++) {
					System.out.println("Enter the elements one by one");
					arr[i] = input.nextInt();
				}
				int length = arr.length;
				System.out.println("Disorganized array: ");
				disorganizedArray.printArray(arr, length);
				disorganizedArray.quickSortAsc(arr, 0, length - 1);
				System.out.println("Organized array: ");
				disorganizedArray.printArray(arr, length);

			} else if (choice == 2) {
				System.out.println("You chose NUMBERS on DESCENDING way.");
				QuicksortDesc disorganizedArray = new QuicksortDesc();
				System.out.println("Enter the size of the array (number of elements)");
				int size = input.nextInt();
				int[] arr = new int[size];
				for (int i = 0; i < size; i++) {
					System.out.println("Enter the elements one by one");
					arr[i] = input.nextInt();
				}
				int length = arr.length;
				System.out.println("Disorganized array: ");
				disorganizedArray.printArray(arr, length);
				disorganizedArray.quickSortDesc(arr, 0, length - 1);
				System.out.println("Organized array: ");
				disorganizedArray.printArray(arr, length);

			} else if (choice == 3) {
				System.out.println("You chose LETTERS on ASCENDING way.");
				SortStringCharAsc disorganizedArray = new SortStringCharAsc();
				System.out.println("Send the letters you want to sort in only one line withouth spaces");
				String string = input.next();
				char arr[] = string.toCharArray();
				disorganizedArray.lettersSortAsc(arr);
				System.out.println("Organized array: ");
				System.out.println(new String(arr));

			} else if (choice == 4) {
				System.out.println("You chose LETTERS on DESCENDING way.");
				SortStringCharDesc disorganizedArray = new SortStringCharDesc();
				System.out.println("Send the letters you want to sort in only one line withouth spaces");
				String string = input.next();
				char arr[] = string.toCharArray();
				disorganizedArray.lettersSortDesc(arr);
				System.out.println("Organized array: ");
				System.out.println(new String(arr));

			} else {
				System.out.println("Invalid option.");
			}
		}
	}
}
