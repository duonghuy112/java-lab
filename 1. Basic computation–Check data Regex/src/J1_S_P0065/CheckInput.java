package J1_S_P0065;

import java.util.Scanner;

public class CheckInput {
	private static Scanner sc = new Scanner(System.in);

	public static int checkInt() {
		try {
			int input = sc.nextInt();
			return input;
		} catch (Exception e) {
			System.err.println("Please input a number! Input again: ");
			sc.nextLine();
			return checkInt();
		}
	}
	
	public static String checkString() {
		try {
			String input = new Scanner(System.in).nextLine();
			return input;
		} catch (Exception e) {
			System.err.println("Please input a String! Input again: ");
			sc.nextLine();
			return checkString();
		}
	}
	
	
	public static float checkfloat() {
		try {
			float input = sc.nextFloat();
			return input;
		} catch (Exception e) {
			System.err.println("Please input a number! Input again: ");
			sc.nextLine();
			return checkfloat();
		}
	}
	
	public static float checkRange(float min, float max) {
		float input = checkfloat();
		
		if (input < min) {
			System.err.println("Input must greater than equal "+ min + "!");
			return checkRange(min, max);
		}
		if (input > max) {
			System.err.println("Input must less than equal "+ max+"!");
			return checkRange(min, max);
		}
		
		return input;
	}
}
