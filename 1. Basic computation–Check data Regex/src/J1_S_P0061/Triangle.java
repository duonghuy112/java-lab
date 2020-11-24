package J1_S_P0061;

public class Triangle extends Shape {
	private double sideA;
	private double sideB;
	private double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Triangle() {
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	double getP() {
		return (this.sideA + this.sideB + this.sideC) / 2;
	}

	@Override
	double getArea() {
		return Math.sqrt(getP() * (getP() - this.sideA) * (getP() - this.sideB) * (getP() - this.sideC));
	}

	@Override
	double getPerimeter() {
		return this.sideA + this.sideB + this.sideC;
	}

	@Override
	void printResult() {
		System.out.println("-----Triangle-----");
		System.out.println("Side A: " + this.sideA);
		System.out.println("Side B: " + this.sideB);
		System.out.println("Side C: " + this.sideC);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}
}
