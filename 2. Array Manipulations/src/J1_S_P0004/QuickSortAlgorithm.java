package J1_S_P0004;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSortAlgorithm {
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
	
	static void quickSort(int[] a, int l, int r) {
		int left = l;
		int right = r;
		int mid = a[(l + r) / 2];
		while (left <= right) {
			while (a[left] < mid) {
				left++;
			}
			while (a[right] > mid) {
				right--;
			}
			if (left <= right) {
				int tmp = a[left];
				a[left] = a[right];
				a[right] = tmp;
				left++;
				right--;
			}
		}
		if (left < r) {
			quickSort(a, left, r);
		}		
		if (right > l) {
			quickSort(a, l, right);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of array: ");
		int n = checkInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = rd.nextInt(11);
		}
		System.out.println("Unsorted array: " + Arrays.toString(a));
		
		quickSort(a, 0, n-1);
		
		System.out.println("Sorted array: " + Arrays.toString(a));
	}
}
