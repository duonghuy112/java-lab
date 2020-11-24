package J1_S_P0010;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearchAlgorithm {
	private static Scanner sc = new Scanner(System.in);
	private static Random rd = new Random();

	static int checkInt() {
		try {
			int input = sc.nextInt();
			if (input > 0) {
				return input;
			} else {
				System.err.println("Input a number greater than 0!");
				sc.nextLine();
				return checkInt();
			}
		} catch (Exception e) {
			System.err.println("Please input a number!");
			sc.nextLine();
			return checkInt();
		}
	}

	static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	
	static int linearSearch(int value, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println("Enter number of array: ");
		int n = checkInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = rd.nextInt(11);
		}
		
		System.out.println("Enter search value: ");
		int value = sc.nextInt();
		
		System.out.println("Unsorted array: " + Arrays.toString(a));
		bubbleSort(a);
		System.out.println("Sorted array: " + Arrays.toString(a));
		
		int pos = linearSearch(value, a);
		if (pos > 0) {
			System.out.println("Found " + value + " at index: " + pos);
		} else {
			System.out.println("Can not found " + value + " in array.");
		}
	}
}
