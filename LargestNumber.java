import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		
		int counter = 1;
		
		int largest = 0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any  digit ");
		int number = input.nextInt();
		
		while (counter < 4) { 
			System.out.println("Enter any  digit ");
			
			if(number > largest) {
				largest = number;	
			}
			counter++;
			number = input.nextInt();
		
		}
		
		
		
		System.out.println();
		System.out.printf("The Largest Number is: %d%n", largest);
		
	}

}
