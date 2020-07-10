import java.util.Scanner;
public class DuplicateElimination {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int [] array = new int [5] ;
		int counter = 1;
		int tempNum = 0;
		
		System.out.println("Enter a number: ");
		
		while(counter <= 5) {
			tempNum =input.nextInt();	
		
		  if (tempNum >= 10 && tempNum <= 100) {
		
			for (int i= 0; i < array.length; i++) {
				if(tempNum == array[i])
					break;
				if(tempNum != array[i] && array[i] == 0) {
					array[i] = tempNum;
					counter++;
					for(int j : array) {
						if (j != 0) {
							System.out.print(j + " ");
						}
					}
					System.out.println();
					break;
					}
				}
			}
		  else {
			  System.out.println("Please Enter a Unique Number: ");
			  System.out.println();
		  }
		if (counter != 6)
			System.out.print("Enter another number: ");

		}
	}
}

