import java.util.Scanner;
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle(9.0, 9.0);
		
		System.out.printf("The Area of the rectangle is: %.2f%n", obj.RecArea());
		System.out.printf("The Perimeter of the rectangle is: %.2f%n", obj.RecPerimeter());
		
		

		/*Scanner input = new Scanner(System.in);
		System.out.println("Enter Width: ");
		double width = input.nextDouble();
		
		System.out.println("Enter Length: ");
		double length = input.nextDouble();
		
		System.out.printf("The Area of a rectangle is %.2f%n", obj.RecArea());
		System.out.printf("The Perimeter of a rectangle is %.2f%n", obj.RecPerimeter());
		*/
		
	}

}
