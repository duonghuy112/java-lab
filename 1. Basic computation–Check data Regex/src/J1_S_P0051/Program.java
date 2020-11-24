package J1_S_P0051;

public class Program {
	public static void main(String[] args) {
		Menu pr = new Menu();
		while (true) {
			int choose = pr.menu();
			switch (choose) {
				case 1: 
					pr.normalCalculator();
					break;
				case 2:
					pr.bmiCalculator();
					break;
				case 3:
					System.out.println("Good bye!");
					return;
			}
		}
	}
}
