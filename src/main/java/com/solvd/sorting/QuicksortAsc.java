package com.solvd.sorting;

public class QuicksortAsc {
	public void quickSortAsc(int[] arr, int left, int right) {
		int pivote = arr[left];
		int i = left;
		int j = right;
		int aux;
		while (i < j) {
			while (arr[i] <= pivote && i < j)
				i++;
			while (arr[j] > pivote)
				j--;
			if (i < j) {
				aux = arr[i];
				arr[i] = arr[j];
				arr[j] = aux;
			}
		}
		arr[left] = arr[j];
		arr[j] = pivote;
		if (left < j - 1)
			quickSortAsc(arr, left, j - 1);
		if (j + 1 < right)
			quickSortAsc(arr, j + 1, right);
	}

	void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
