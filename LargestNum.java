
public class LargestNum {

	public static void main(String[] args) {
		
		int counter ;
		int [] number = {2, 55, 2, 99, 6, 89, 190, 67};
		int  maxNumber =  number[0]; //Assume the first element of the array to be the maximum number
		
		for (counter = 0; counter<number.length; counter++) {
			if ( number[counter] > maxNumber ) {
				maxNumber = number[counter];
			}
			
		}
		System.out.printf("The number of times the iteration%n took place was %d times. %n ", counter);
		System.out.println();
		System.out.printf("The maximum number is: %d%n", maxNumber);

	}

}
