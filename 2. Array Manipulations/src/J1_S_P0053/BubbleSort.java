package J1_S_P0053;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	private static Scanner sc = new Scanner(System.in);
	
	static int checkInt() {
		try {
			int input = sc.nextInt();
			return input;
		} catch (Exception e) {
			System.err.println("Please input a number!");
			sc.nextLine();
			return checkInt();
		}
	}
	
	static int checkIntRange(int min, int max) {
		int input = checkInt();
		if (input >= min && input <= max) {
			return input;
		} else {
			System.err.println("Out of range [" + min + ", " + max + "]. Input again:");
			sc.nextLine();
			return checkIntRange(min, max);
		}
	}
	
	static int checkIntGreaterThan0() {
		int input = checkInt();
		if (input > 0) {
			return input;
		} else {
			System.err.println("Please input numberand number is greater than 0");
			return checkIntGreaterThan0();
		}
	}
	
	static void sortAscending(int[] a) {
		System.out.println("----- Ascending -----");
		
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
		
		System.out.println(Arrays.toString(a));
	}
	
	static void sortDescending(int[] a) {
		System.out.println("----- Descending -----");
		
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
		
		System.out.println(Arrays.toString(a));
	}
	
	static int[] inputElement() {
		System.out.println("----- Input Element -----");
		System.out.println("Input Length Of Array");
		System.out.println("Enter number: ");
		int n = checkIntGreaterThan0();
		int[] a = new int[n];
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter number " + i +": ");
			a[i-1] = checkInt();
		}
		return a;
	}
	
	
	
	public static void main(String[] args) {
		int[] a = null;
		while (true) {
			System.out.println("========= Bubble Sort program =========");
			System.out.println("1. Input Element");
			System.out.println("2. Sort Ascending");
			System.out.println("3. Sort Descending");
			System.out.println("4. Exit");
			
			int choose = checkIntRange(1, 4);
			
			switch (choose) {
				case 1:
					a = inputElement();
					break;
				case 2: 
					sortAscending(a);
					break;
				case 3:
					sortDescending(a);
					break;
				case 4:
					System.out.println("Goodbye!");
					return;
			}
		}
		
	}
	
	
}
