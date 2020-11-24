package J1_S_P0061;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle() {
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	double getArea() {
		return Math.pow(this.radius, 2) * Math.PI;
	}

	@Override
	double getPerimeter() {
		return 2 * this.radius * Math.PI;
	}

	@Override
	void printResult() {
		System.out.println("-----Circle-----");
		System.out.println("Radius: " + this.radius);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}

}
