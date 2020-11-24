package J1_S_P0061;

import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("=====Calculator Shape Program=====");
		System.out.println("Please input side width of Rectangle: ");
		double w = sc.nextDouble();
		System.out.println("Please input length of Rectangle: ");
		double l = sc.nextDouble();
		
		System.out.println("Please input radius of Circle: ");
		double r = sc.nextDouble();
		
		System.out.println("Please input side A of Triangle: ");
		double a = sc.nextDouble();
		System.out.println("Please input side B of Triangle:");
		double b = sc.nextDouble();
		System.out.println("Please input side B of Triangle:");
		double c = sc.nextDouble();
		
		System.out.println("===================================");
		Rectangle rec = new Rectangle(w, l);
		rec.printResult();
		Circle ci = new Circle(r);
		ci.printResult();
		Triangle tri = new Triangle(a, b, c);
		tri.printResult();
	}
}
