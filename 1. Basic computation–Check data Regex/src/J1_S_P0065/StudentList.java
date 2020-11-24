package J1_S_P0065;

import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> stuList = new ArrayList<>();

	public StudentList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}

	public StudentList() {
	}

	public ArrayList<Student> getStuList() {
		return stuList;
	}

	public void setStuList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}

	public void add(Student stu) {
		stuList.add(stu);
	}

	public void display() {
		int i = 1;
		for (Student stu : stuList) {
			System.out.println("------ Student" + i + " Info ------");
			stu.printStudent();
			i++;
		}
	}

	public void displayClassInfo() {
		int a = 0, b = 0, c = 0, d = 0;
		System.out.println("--------Classification Info -----");
		for (Student stu : stuList) {
			if (stu.getType().equalsIgnoreCase("A")) {
				a ++;
			}
			if (stu.getType().equalsIgnoreCase("B")) {
				b ++;
			}
			if (stu.getType().equalsIgnoreCase("C")) {
				c ++;
			}
			if (stu.getType().equalsIgnoreCase("D")) {
				d ++;
			}
		}
		
		System.out.println("A: " + (a / stuList.size() * 100) + "%");
		System.out.println("B: " + (b / stuList.size() * 100) + "%");
		System.out.println("C: " + (c / stuList.size() * 100) + "%");
		System.out.println("D: " + (d / stuList.size() * 100) + "%");
	}
}
