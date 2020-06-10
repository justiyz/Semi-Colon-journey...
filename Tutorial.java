import java.util.Scanner;

public class Tutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int product = 1;
//		int counter = 1;
//		
//		while (counter <= 100) {
//			product = product * 3;
//			if (product >= 100) { 
//			System.out.print("The power to which 3 must be raised to be greater than 100 is: "+ counter);
//			break;
//			}
//			counter++;
//			
//			}
//PRINTING THE PRODUCT OF 3 THAT IS GREATER THAN 100
		
		
		
//		
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter any number or -1 to quit");
//			int hello = input.nextInt();
//			
//			while (hello != -1) {
//				System.out.println("Enter another number or -1 to quit");
//				hello = input.nextInt();
//				if (hello == -1) {
//					System.out.println();
//					System.out.println("YOU QUIT!!!");
//					break;
//			}
//			}
//DISPLAYING AN INTEGER VALUE FROM THE USER AND UNTIL WE USE SENTINEL VALUE TO EXIT

		
		
//		Scanner input = new Scanner(System.in);
//		int pass = 0;
//		int fail = 0;
//		int studentCounter = 1;
//		
//		while (studentCounter <= 5) {
//			System.out.println("Enter next exam result(1 to pass, 2 to fail): ");
//			int result = input.nextInt();
//			if (result == 1) 
//				pass = pass + 1;
//			
//			else 
//				fail = fail + 1;
//			studentCounter++;
//			
//			
//			System.out.printf("The number of students that passed is %d%n", pass);
//			System.out.printf("The number of students that passed is %d%n", fail);
//		}
//			if (pass <= 8) {
//				System.out.println("Bonus to the instructor");
//			}
//ANALYSIS OF EXAMINATION RESULT USING NESTED CONTROL STATEMENT... 
		
			
/*	int numberOfYears = 10;
		double principal = 1000;
		double rate = 0.05;
	double amount;
	double total = 0;
	int counter = 20;
	int grade = 6;
		
		System.out.printf("%8s %10s %s\n", "Number of Years", "Amounts","total");
		for (int i = 1; i <= numberOfYears; i++){
			
			 amount =  principal * Math.pow(1.0 + rate, i);
			 
			 System.out.printf("%8d%17.2f% .2f%n", i, amount,total);

		} */
		
		//ANOTHER WAY OF DOING IT IS ->

	
		/* System.out.println();
			System.out.println();
		
		System.out.printf("%s%15s%n", "Number of Years", "Amounts");
		
		for (int i = 1; i <= numberOfYears; i++){
						principal = principal + principal * 0.05;		
			System.out.printf("%8d %22.2f\n", i, principal);
			
	}
		System.out.println();
		
		System.out.printf("The amount of Salary with increment%n after 10 years is %f", principal);
		
		
		System.out.println();
		System.out.println(); */
		
//FINDING THE SALARY INCREMENT WITH 5% FOR 10 YEARS......
		
		
		
		
		
		
	/*	while (counter <= 10) {
			System.out.printf("%d ", counter);
			++counter;
		}
		
		
		System.out.println();
		
		
		switch(grade) {
		case 90: System.out.println("Scored A");
		break;
		case 60: System.out.println("Scored B");
		break;
		case 40: System.out.println("Failed");
		break;
		default: System.out.println("You did not take the exam"); */
		
		
		
//USING THE SWITCH STATEMENT TO PRINT OUT GRADE SCORE...............
		
	/*	int size = 10;
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if (j <= i) {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	 */
		
//PRINTING A PATTERN WITH ASTERISKS USING FOR STATEMENT1
		
		
		
	/*	for (int i = 10; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} */
		
//PRINTING A PATTERN WITH ASTERISKS USING FOR STATEMENT2
		
	/*	int size = 10;
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if (j <= i) {
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		int numOfRows = 31;
		int numOfSpace = numOfRows/2;
		int numOfStars = 1;
		int midPoint = numOfRows/2 +1 ;
		for (int i = 1; i <= numOfRows; i++) {
			for(int j = 1; j <= numOfSpace; j++) {
				System.out.print(" ");
			}
			for (int k =1; k <= numOfStars; k++) {
				System.out.print("*");
			}
			if (i < midPoint) {
				numOfSpace--;
				numOfStars +=2;
			}
			else {
				numOfSpace ++;
				numOfStars -=2;
			}
			System.out.println();
		}
		
		
		
		
	}		
		
}

		
		
	


