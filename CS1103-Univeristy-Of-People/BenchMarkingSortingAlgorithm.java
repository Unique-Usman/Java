package example;

import java.util.Arrays;
/**
 * @author: Usman Akinyemi
 * The BenchMarkingSortingAlgorithm class benchmarks the performance of two sorting algorithms:
 * insertion sort and the built-in Arrays.sort() method. It measures the execution time of each
 * algorithm for different array sizes and prints the results.
 */

//For Array of size:  1000
//1 - Insertion sort
//1 - Built Arrays.sort
//For Array of size:  10000
//25 - Insertion sort
//2 - Built Arrays.sort
//For Array of size:  100000
//576 - Insertion sort
//8 - Built Arrays.sort
public class BenchMarkingSortingAlgorithm {
	
	static private int ArraySize = 1000;

	public static void main(String[] args) {
		int[] arr;
		int[] arr2;

		for (int j = 0; j < 3; j++) {
			if (j == 0) ArraySize = 1000;
			if (j == 1) ArraySize = 10000;
			if (j == 2) ArraySize = 100000;
			arr = new int[ArraySize];
			arr2 = new int[ArraySize];
			for (int i = 0; i < ArraySize; i++) {
				arr[i] = (int)(Integer.MAX_VALUE * Math.random());
				arr2[i] = (int)(Integer.MAX_VALUE * Math.random());
			}

			long startTime = System.currentTimeMillis();
			insertSort(arr);
			long runTimeForInsertionSort = System.currentTimeMillis() - startTime;

			startTime = System.currentTimeMillis();
			Arrays.sort(arr2);
			long runTimeForBuiltInSort = System.currentTimeMillis() - startTime;
			
			System.out.println("For Array of size: " + " " + ArraySize);
			System.out.println(runTimeForInsertionSort);
			System.out.println(runTimeForBuiltInSort);
		}

	}
	
	/**
	 * Sorts an integer array using the insertion sort algorithm.
	 *
	 * @param arr the array to be sorted
	 */
	static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			int j = i - 1;
			while (j >= 0 && x < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = x;
		}
	}

}
