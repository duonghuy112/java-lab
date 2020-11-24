package J1_S_P0051;

public class Menu {
	public int menu() {
		System.out.println("========= Calculator Program =========");
		System.out.println("1. Normal Calculator");
		System.out.println("2. BMI Calculator");
		System.out.println("3. Exit");
		System.out.println("Please choice one option: ");
		int choose = CheckInput.checkInt();
		return choose;
	}
	
	public void normalCalculator() {
		System.out.println("Enter number: ");
		double result = CheckInput.checkDouble();
		
		while (true) {
			System.out.println("Enter Operator: ");
			Operator op = CheckInput.checkOperator();
			
			if (op.getOpe() == '=') {
				System.out.println("Result: " + result);
				return;
			}
			
			System.out.println("Enter number: ");
			double b = CheckInput.checkDouble();
			result = caculate(result, op, b);
			System.out.println("Memory: " + result);
		}
	}
	
	public double caculate(double a, Operator op, double b) {
		switch (op.getOpe()) {
			case '+':
				return a + b;
			case '-':
				return a - b;
			case '*':
				return a * b;
			case '/':
				return a / b;
			case '^':
				return Math.pow(a, b);
		}
		return caculate(a, op, b);

	}
	
	public void bmiCalculator() {
		System.out.println("----- BMI Calculator -----");
		System.out.println("Enter Weight(kg): ");
		double weight = CheckInput.checkDouble();
		System.out.println("Enter Height(m): ");
		double height = CheckInput.checkDouble();
		
		double bmi = (double) (weight / Math.pow(height, 2));
		System.out.println("BMI Number: " + bmi);
		System.out.println("BMI Status: " + bmi(weight, height));
	}
	
	public BMI bmi (double w, double h) {
		double bmi = (double) (w / Math.pow(h, 2));
		if (bmi < 19) {
			return BMI.UNDER_STANDAR;
		} else if (bmi < 25) {
			return BMI.STANDARD;
		} else if (bmi < 30) {
			return BMI.OVER_WEIGHT;
		} else if (bmi < 40) {
			return BMI.FAT;
		} else {
			return BMI.VERY_FAT;
		}
	}
}
