package J1_S_P0050;

public class Program {
	public static void main(String[] args) {
		Menu pr = new Menu();
		while (true) {
			int choose = pr.menu();
			switch (choose) {
			case 1:
				pr.calculateSuperlativeEquation();
				break;
			case 2:
				pr.calculateQuadraticEquation();
				break;
			case 3:
				System.out.println("Good bye!");
				return;
			}
		}
		
	}
}
