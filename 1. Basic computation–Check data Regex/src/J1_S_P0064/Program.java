package J1_S_P0064;

public class Program {
	public static void main(String[] args) {
		Menu pr = new Menu();
		
		while (true) {
			int choose = pr.menu();
			switch (choose) {
				case 1:
					pr.phone();
					break;
				case 2: 
					pr.email();
					break;
				case 3:
					pr.date();
					break;
				case 4:
					System.out.println("Good bye!");
					System.exit(0);
			}
		}
	}
}
