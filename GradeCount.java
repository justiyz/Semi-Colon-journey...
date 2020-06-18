import java.util.Scanner;
public class GradeCount {

	public static void main(String[] args) {
		
		int mean = 0;
		
		int counter = 0;
		int maximum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Grade: ");
		int grade = input.nextInt();
		
		while (grade != -1) {
			System.out.println("Enter Grade or -1 to exit");
			
			if (grade > maximum) {
				maximum = grade;
			}
			
			mean = mean + grade ;
			counter++;
			
			grade = input.nextInt();
			
			
		}
		System.out.println();
		System.out.printf("The mean is: %d%n", mean/counter);
		System.out.printf("The maximum value is: %d%n", maximum);
	}

}
