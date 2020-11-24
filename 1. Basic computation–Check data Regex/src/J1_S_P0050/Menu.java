package J1_S_P0050;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	public int menu() {
		System.out.println("========= Equation Program =========");
		System.out.println("1. Calculate Superlative Equation");
		System.out.println("2. Calculate Quadratic Equation");
		System.out.println("3. Exit");
		System.out.println("Enter: ");
		int choose = Number_Calculate.checkIntNumber();
		return choose;
	}
	
	public void calculateSuperlativeEquation() {
		System.out.println("----- Calculate Equation -----");
		System.out.println("Enter A: ");
		double a = Number_Calculate.checkDoubleNumber();
		System.out.println("Enter B: ");
		double b = Number_Calculate.checkDoubleNumber();
		
		List<Double> result = new ArrayList<>();
		result = Number_Calculate.caculateEquation(a, b);
		if (result.isEmpty()) {
			System.out.println("No solution");
		} else if (result.size() == 2) {
			System.out.println("Infinitely many solutions");
		} else if (result.size() == 1) {
			System.out.println("Solution: x = " +result.get(0));
		}
		
		double[] arr = new double[] {a, b};
		double evenNumber [] = new double[2];
		double oddNumber [] = new double[2];
		double perfectSquareNumber [] = new double[2];
		
		for(int i = 0; i < 2; i++) {
			if (Number_Calculate.isEven((int)arr[i])) {
				evenNumber[i] = arr[i];
			}
			if (Number_Calculate.isOdd((int)arr[i])) {
				oddNumber[i] = arr[i];
			}
			if (Number_Calculate.isPerpectSquare((int)arr[i])) {
				perfectSquareNumber[i] = arr[i];
			}
		}
		System.out.print("Even number: ");
		for (double e : evenNumber) {
			if (e != 0) {
			System.out.print(e + " ");
			}
		}
		System.out.println();
		
		System.out.print("Odd number: ");
		for (double o : oddNumber) {
			if (o != 0) {
			System.out.print(o + " ");
			}
		}
		System.out.println();
		
		System.out.print("Perfect Square number: ");
		for (double ps : perfectSquareNumber) {
			if (ps != 0) {
			System.out.print(ps + " ");
			}
		}
		System.out.println();
		
	}
	
	public void calculateQuadraticEquation() {
		System.out.println("----- Calculate Quadratic Equation -----");
		System.out.println("Enter A: ");
		double a = Number_Calculate.checkDoubleNumber();
		System.out.println("Enter B: ");
		double b = Number_Calculate.checkDoubleNumber();
		System.out.println("Enter C: ");
		double c = Number_Calculate.checkDoubleNumber();
		
		List<Double> result = new ArrayList<>();
		result = Number_Calculate.calculateQuadraticEquation(a, b, c);
		if (result.isEmpty()) {
			System.out.println("No solution");
		} else if (result.size() == 1) {
			System.out.println("Solution x = " + result.get(0));
		} else if (result.size() == 2) {
			System.out.println("Solution x1 = " + result.get(0) + " and x2 = " + result.get(1));
		} else {
			System.out.println("Infinitely many solutions");
		}
		
		double[] arr = new double[] {a, b, c};
		double evenNumber [] = new double[3];
		double oddNumber [] = new double[3];
		double perfectSquareNumber [] = new double[3];
		
		for(int i = 0; i < 3; i++) {
			if (Number_Calculate.isEven((int)arr[i])) {
				evenNumber[i] = arr[i];
			}
			if (Number_Calculate.isOdd((int)arr[i])) {
				oddNumber[i] = arr[i];
			}
			if (Number_Calculate.isPerpectSquare((int)arr[i])) {
				perfectSquareNumber[i] = arr[i];
			}
		}
		System.out.print("Even number: ");
		for (double e : evenNumber) {
			if (e != 0) {
			System.out.print(e + " ");
			}
		}
		System.out.println();
		
		System.out.print("Odd number: ");
		for (double o : oddNumber) {
			if (o != 0) {
			System.out.print(o + " ");
			}
		}
		System.out.println();
		
		System.out.print("Perfect Square number: ");
		for (double ps : perfectSquareNumber) {
			if (ps != 0 && ps != 1) {
			System.out.print(ps + " ");
			}
		}
		System.out.println();
	}
}
