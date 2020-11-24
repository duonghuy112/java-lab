package J1_S_P0064;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckInput {
	private static Scanner sc = new Scanner(System.in);
	private static final String PHONE_VALID = "^[0]+[0-9]{9}$";
	private static final String EMAIL_VALID = "^[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
	
	public static int checkInt() {
		try {
			int input = sc.nextInt();
			return input;
		} catch (Exception e) {
			System.err.println("Please input a number! Enter again: ");
			sc.nextLine();
			return checkInt();
		}
	}

	public static int checkRangeInt(int min, int max) {
		int input = checkInt();
		if (input >= min && input <= max) {
			return input;
		} else {
			System.out.println("Out of range [ " + min + " - " + max + " ], type again:");
			return checkRangeInt(min, max);
		}
	}

	public static String checkString() {
		try {
			String input = new Scanner(System.in).nextLine();
			return input;
		} catch (Exception e) {
			System.err.println("Please input a String! Enter again: ");
			sc.nextLine();
			return checkString();
		}
	}

	public static String checkPhone() {
		String input = checkString();

		if (input.matches(PHONE_VALID)) {
			return input;
		} else {
			System.err.println("Phone number must be 10 digits and start with 0");
			return checkPhone();
		}
	}

	public static String checkEmail() {
		String input = checkString();

		if (input.matches(EMAIL_VALID)) {
			return input;
		} else {
			System.err.println("Email must is correct format (abc@xyz.com)");
			return checkEmail();
		}
	}
	
	public static String checkDate() {
		try {
			String dateCheck = checkString();
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateCheck);
			return dateCheck;
		} catch (ParseException e) {
			System.err.println("Date must be in DD/mm/YYYY format!");
			return checkDate();
		}
		
	}
}
