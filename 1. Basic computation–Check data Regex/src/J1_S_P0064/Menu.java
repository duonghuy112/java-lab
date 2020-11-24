package J1_S_P0064;

public class Menu {
	public int menu() {
		System.out.println("========== Validation Program ==========");
		System.out.println("1 - Check Phone");
		System.out.println("2 - Check Email");
        System.out.println("3 - Check Date");
        System.out.println("4 - Exit");
        int choose = CheckInput.checkRangeInt(1, 4);
        return choose;
	}
	
	public void phone() {
		System.out.println("====== Validate Phone Number ======");
		System.out.println("Phone Number: ");
		String input = CheckInput.checkPhone();
		System.out.println("Correct phone number!");
		System.out.println("Your number is: " + input);
	}
	
	public void email() {
		System.out.println("====== Validate Email ======");
		System.out.println("Email: ");
		String input = CheckInput.checkEmail();
		System.out.println("Correct email! ");
		System.out.println("Your email is: " + input);
	}
	
	public void date() {
		System.out.println("====== Validate Email ======");
		System.out.println("Date: ");
		String input = CheckInput.checkDate();
		System.out.println("Correct date format!");
		System.out.println("Day is: " + input);
	}
}
