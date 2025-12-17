/**
 * Rectangle.java
 * 
 * Name: Krish Senthil	
 * Period: 2
 * Last Revision Date: 12/17/2025
 * Description: 
 */

public class Rectangle implements Shape {
	private double height;
	private double width;
	
	Rectangle(double H, double W) {
		height = H;
		width = W;
	}
	
	@Override
	public int compareTo(Shape o) {
		if (getArea() > o.getArea()) {
			return 1;
		}
		if (getArea() < o.getArea()) {
			return -1;
		}
		return 0;
	}

	@Override
	public double getArea() {
		return (height*width);
	}

	@Override
	public double getPerimeter() {
		return (2*height) + (2*width);
	}
	
	public String toString() {
		return String.format("Rectangle - Height: %.2f, Width: %.2f", height, width);
	}

}
