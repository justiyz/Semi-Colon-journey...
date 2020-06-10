import java.util.Scanner;

public class Rectangle {

	  double length = 1;
	  double width = 1;
	  
	  
	  
	  public Rectangle(double length, double width) {
		  if (length > 0.0 && length < 20.0)
				this.length = length;
		  if (width > 0.0 && width < 20.0)
				this.width = width;
	  }
	  
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if (length > 0.0 && length < 20.0)
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width > 0.0 && width < 20.0)
		this.width = width;
	}
	  
	public double RecArea() {
		double area = length * width;
		return area;
	}
	
	public double RecPerimeter() {
		double perimeter = 2 * (length + width) ;
		return perimeter;
	}

	
	
	
}
