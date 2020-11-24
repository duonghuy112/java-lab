package J1_S_P0051;

import java.util.Scanner;

public class CheckInput {
	private static Scanner sc = new Scanner(System.in);
	
	public static int checkInt() {
		try {
			int input = sc.nextInt();
			return input;
		} catch (NumberFormatException e) {
			System.err.println("Please input a number! Enter again: ");
			sc.nextLine();
			return checkInt();
		}
	}
	
	public static double checkDouble () {
		try {
			double input = sc.nextDouble();
			return input;
		} catch (Exception e) {
			System.err.println("Please input a number! Enter again: ");
			sc.nextLine();
			return checkDouble();
		}
	}
	
	public static int checkInputRange(int min, int max) {
		int temp = checkInt();
        if ((temp >= min) && (temp <= max)) {
        	return temp;
        } else {
                System.out.print("Out of range [ "+min+" - "+max+" ], type again:"); 
                return checkInputRange(min, max);
            }
	}
	
	public static char checkChar() {
		char c = sc.next().charAt(0);
//		if (c.isEmpty()) {
//			System.err.println("Empty input!");
//			return checkChar();
//		} 
//		if (c.length() > 1) {
//			System.err.println("Invalid input! Just single char!");
//			return checkChar();
//		}
		if (c >= '0' && c <= '9') {
			System.err.println("Not a number!");
			return checkChar();
		}
		return c;
	}
	
	public static Operator checkOperator() {
		char input = checkChar();
		if (input == '+' || input == '-' || input == '*' ||
			input == '/' || input == '^' || input == '=') {
				return new Operator(input);
		} else {
			System.err.println("Please input (+, -, *, /, ^, =)");
			return checkOperator();
		}

	}
	
}
