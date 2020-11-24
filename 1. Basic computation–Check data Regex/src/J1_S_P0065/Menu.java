package J1_S_P0065;

import java.util.Scanner;

public class Menu {
	private static Scanner sc = new Scanner(System.in);

	private static StudentList list = new StudentList();

	public static void main(String[] args) {
		

		System.out.println("====== Management Student Program ======");
		while (true) {
			Student stu = new Student();
			System.out.println("Name: ");
			String name = CheckInput.checkString();
			stu.setName(name);
			System.out.println("Classes: ");
			String classes = CheckInput.checkString();
			stu.setClasses(classes);
			System.out.println("Math: ");
			float math = CheckInput.checkRange(0, 10);
			stu.setMath(math);
			System.out.println("Chemistry: ");
			float chemistry = CheckInput.checkRange(0, 10);
			stu.setChemistry(chemistry);
			System.out.println("Physics: ");
			float physics = CheckInput.checkRange(0, 10);
			stu.setPhysics(physics);
			
			list.add(stu);
			
			System.out.println("Do you want to enter more student information?(Y/N):");
			String choose = new Scanner(System.in).nextLine();
			if (choose.equalsIgnoreCase("N")) {
				list.display();
				list.displayClassInfo();
				return;
			}
		}

	}
}
