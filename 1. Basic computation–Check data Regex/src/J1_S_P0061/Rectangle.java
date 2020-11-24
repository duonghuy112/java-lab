package J1_S_P0061;

public class Rectangle extends Shape {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle() {
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	double getArea() {
		return this.width * this.length;
	}

	@Override
	double getPerimeter() {
		return this.length + this.width;
	}

	@Override
	void printResult() {
		System.out.println("-----Rectangle-----");
		System.out.println("Width: " + this.width);
		System.out.println("Length: " + this.length);
		System.out.println("Area: " + getArea());
		System.out.println("Perimeter: " + getPerimeter());
	}

}
