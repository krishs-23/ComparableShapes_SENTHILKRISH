/**
 * ShapeTester.java
 * 
 * Name: Krish Senthil
 * Period: 2
 * Last Revision Date: 12/17/2025
 * Description: 
 */

import java.util.*;

public class ShapeTester {
  public static void main(String[] args) {
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    
    shapes.add(new Rectangle(5.0, 5.0));
    shapes.add(new Rectangle(7.0, 3.0));
    
    for (Shape shape : shapes) {
    	System.out.println(shape);
    	System.out.printf("Area = %.4f", shape.getArea());
    	System.out.print("Perimeter = " + shape.getPerimeter());
    }
    
    
    
  }
}
