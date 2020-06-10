import java.util.Scanner;
public class Miles1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int trip =1;
		int totalMilesDriven = 0;
		int totalGallonDriven = 0;
		double combMilesPerGal = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Miles driven or -1 to quit: ");
		int miles = input.nextInt();
		
		while (miles != -1) {
			System.out.println("Enter gallons used: ");
//			input = new Scanner(System.in);
			int gallons = input.nextInt();
			
			int milesPerGallon = miles / gallons;
			totalMilesDriven = totalMilesDriven + miles;
			totalGallonDriven = totalGallonDriven + gallons;
			++trip;
			
			System.out.println("The miles per gallon is "+ milesPerGallon);
			miles = input.nextInt();
			}
		
		combMilesPerGal = (double) totalMilesDriven / totalGallonDriven;
		
		System.out.println("The total miles driven is "+ totalMilesDriven);
		System.out.println("The total gallons used is "+ totalGallonDriven);
		System.out.println("The Combined miles per gallon is " + combMilesPerGal);
		
		input.close();
		
			
		
	}

}
//CALCULATING AND PRINTING MILES PER GALLON- Chapter 4