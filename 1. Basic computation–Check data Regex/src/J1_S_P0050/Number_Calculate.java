package J1_S_P0050;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Number_Calculate {
	private static Scanner sc = new Scanner(System.in);
	
	public static int checkIntNumber () {
		try {
			int input = sc.nextInt();
			return input;
		} catch (Exception e) {
			System.err.println("Please input a number! Enter again: ");
			sc.nextLine();
			return checkIntNumber();
		}
	}
	
	public static double checkDoubleNumber () {
		try {
			double input = sc.nextDouble();
			return input;
		} catch (Exception e) {
			System.err.println("Please input a number! Enter again: ");
			sc.nextLine();
			return checkDoubleNumber();
		}
	}
	
	public static int checkInputRange(int min, int max) {
		int temp = checkIntNumber();
        if ((temp >= min) && (temp <= max)) {
        	return temp;
        } else {
                System.out.print("Out of range [ "+min+" - "+max+" ], type again:"); 
                return checkInputRange(min, max);
            }
	}
	
	public static boolean isEven(int number) {
		return (number % 2 == 0);
	}
	
	public static boolean isOdd(int number) {
		return (number % 2 ==1);
	}
	
	public static boolean isPerpectSquare(double number) {
		double square = Math.sqrt(number);
		return (square - Math.floor(square) == 0);
		
	}
	
	public static List<Double> caculateEquation(double a, double b) {
		List<Double> result = new ArrayList<>();
		if (a == b && b == 0) {
			result.add(a);
			result.add(b);
			return result;
		}
		if (a == 0 && b != 0) {
			return result;
		}
		result.add(-b/a);
		return result;
	}
	
	public static List<Double> calculateQuadraticEquation(double a, double b, double c) {
		List<Double> result = new ArrayList<>();
		if (a == 0) {
			if (b == 0 && c == 0) {
				result.add(a);
				result.add(b);
				result.add(c);
				return result;
			} 
			if (b == 0 && c != 0) {
				return result;
			}
			result.add(-c/b);
			return result;
		}
		
		double delta = Math.pow(b, 2) - 4*a*c;
		if (delta < 0) {
			return result;
		}
		if (delta == 0) {
			result.add(-b/(2*a));
			return result;
		}
		result.add(-b - Math.sqrt(delta)/(2*a));
		result.add(-b + Math.sqrt(delta)/(2*a));
		return result;
	}
}
