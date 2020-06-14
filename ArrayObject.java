import java.util.Scanner;
import java.security.SecureRandom;

public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
//		System.out.printf("%s%8s\r", "Index", "Value");
//		
//		
//		for(int counter = 0; counter < array.length; counter++) {
//			System.out.printf("%3d%8d\r", counter, array[counter]);
//		}
// INITIALIZING ELEMENTS OF AN ARRAY WITH ARRAY INITIALIZER
		
		
		
		
		
		
//		final int ARRAY_LENGTH = 10;
//		int[] array = new int [ARRAY_LENGTH];
//		
//		System.out.printf("%s%8s%n", "Index", "Value");
//		
//		for (int counter = 0; counter < array.length; counter++) {
//			array[counter] =   2 + 2 * counter;
//		System.out.printf("%3d%8d%n", counter, array[counter]);
//		
//		}
//CALCULATING EVEN NUMBERS TO BE PLACED INTO ELEMENTS OF ARRAYS. 
		
		
		
		
		
		
//		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
//		int total = 0;
//		
//		
//		for (int counter = 0; counter<array.length; counter++) {
//			total = total + array[counter];
//		}
//		System.out.println("The total number of element in the array is "+total);
//	}
//COMPUTING THE SUM OF ELEMENT IN AN ARRAY.	
		
		
		
		

//		int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
//			System.out.println("Grade Distribuution");
//			for (int counter = 0; counter < array.length; counter++) {
//				if (counter != 10)
//					System.out.printf("%02d-%02d: ", counter*10, counter*10+9);
//				else
//					System.out.printf("%5d: ", 100);
//				for (int stars=0; stars<array[counter]; stars++)
//					System.out.print("*");
//					System.out.println();
//					
//				}
//A BARCHAT PRINTING ARRAY PROGRAM
		
		
		
		
		
//			SecureRandom randomNumbers = new SecureRandom();
//			int[] frequency = new int [7];
//			
//			for (int roll = 1; roll <= 6000000; roll++) { 
//				++frequency[1 + randomNumbers.nextInt(6)];
//			}
//				System.out.printf("%s%12s%n", "Face",   "Frequency");
//				for (int counter = 1; counter<frequency.length; counter++) {
//					System.out.printf("%3d%12d%n", counter, frequency[counter]);
//				}
//A DIE ROLLING PROGRAM USING ARRAY INSTEAD OF SWITCH
				
				
		
		
		
//		int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3,2, 3, 3, 2, 14 };
//		int[] frequency = new int [6];
//		
//		for (int answer=0; answer<responses.length; answer++) {
//			try {
//				++frequency[responses[answer]];
//			}
//			catch(ArrayIndexOutOfBoundsException e){
//				System.out.println(e);
//				System.out.printf(" responses[%d] = %d%n%n", answer, responses[answer]);
//			}
//	}
//		System.out.printf("%s%10s%n", "Rating", "Frequency");
//		for (int rating = 1; rating<frequency.length; rating++)
//			System.out.printf("%6d%10d%n", rating, frequency[rating]);

// A POLL ANALYSIS PROGRAM 
			
			
			


//		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
//		int total = 0;
//		
//		for (int number : array)
//			total = total + number;
//		System.out.printf("Total of array elements is : %d%n", total);
		
//USING ADVANCED FOR STATEMENTS TO TOTAL ELEMEMTS IN AN ARRAY 
		
		
		
		
/*		int[] array = { 1, 2, 3, 4, 5 };
		System.out.printf(
				 "Effects of passing reference to entire array:%n" +
				 "The values of the original array are:%n");
		
		for (int value : array)
			 System.out.printf(" %d", value);
		
		modifyArray(array);
		System.out.printf("%n%nThe values of the modified array are:%n");
		
		for (int value : array)
			 System.out.printf(" %d", value);
		
		System.out.printf(
				"%n%nEffects of passing array element value:%n" +
				 "array[3] before modifyElement: %d%n", array[3]);
		System.out.println();
		
		
		modifyElement(array[3]);
		System.out.printf(
				 "array[3] after modifyElement: %d%n", array[3]);
		}
	
		public static void modifyArray(int[] array) {
		for (int counter = 0; counter < array.length; counter++)
		array[counter] = array[counter] * 2;
		}
		
		public static void modifyElement(int element)
		{
		element = element * 2;
		System.out.printf(
		"Value of element in modifyElement: %d%n", element);
		System.out.println();  */
		
//PASSING ARRAYS AND INDIVIDUAL ARRAY ELEMENTS TO METHODS..........
		
		
		
		int [][]  array1= {{1,2,3}, {4,5,6}};
		int [][]  array2 = {{1,2}, {3}, {4,5,6}};
		System.out.println("Values in array1 by rows are");
		outputArray(array1);
		
		System.out.printf("%nValues in array2 by row are%n");
		outputArray(array2);
		
		
	}	
	
	
	

		public static void outputArray(int [][] array) {
			
			//loop through array rows
			for (int row =0; row < array.length; row++) {
				
				//loop through columns of current row
				for(int column = 0; column < array[row].length; column++)
					System.out.printf("%d", array[row][column]);
				System.out.println();
			}
		
		
		
		
		
		
		
		
			
			
		}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
