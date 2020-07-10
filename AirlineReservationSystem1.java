import java.util.Scanner;
public class AirlineReservationSystem1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		boolean [] seats = new boolean [10];
		int count = 10;
		int firstClassSeatCOunt = 1;
		int economySeatCount = 6;
		
		while (true) {
		System.out.println("PLEASE TYPE 1 FOR FIRST CLASS OR 2 FOR ECONOMY: ");
		int response = input.nextInt();
		 if (response == 1) {
			 for(int i = 0; i <= 5; i++) {
				 if (i >= 0 && i <= 5 && seats[i] == false ) {
					 seats[i] = true;
					 break;
				 }
//				 System.out.println(seats[i]);
			 }
			 if (firstClassSeatCOunt <= 5) {
			 System.out.printf("[FIRST CLASS]\nSEAT IS STILL AVAILABLE, YOUR SEAT NUMBER IS: %d%n", firstClassSeatCOunt++);
			 System.out.println();
			 }
			 else {
				 System.out.println("THERE ARE NO MORE SEATS AVAILABLE IN THE FIRST CLASS SECTION.\n"
				 		+ "IS IT ACCEPTABLE WE BOOK YOU A SEAT IN THE ECONOMY SECTION?\n"
				 		+ "IF YES, PRESS 2. IF NO, PRESS 0. ");
				 if (input.nextInt() == 0) {
					 System.out.println("NEXT FLIGHT LEAVES IN 3 HOURS");
					 break;
				 }

			   }
			 }
		 else if(response == 2) {
			 for (int j = 5; j < 10; j++) {
				 if (j >= 5 && j <  10 && seats[j] == false) {
					 seats[j] = true;
					 break;
				 }
//				 System.out.println(seats[j]);

			 }
			 if(economySeatCount <= 10) {
				 System.out.printf("[ECONOMY]\nSEAT IS STILL AVAILABLE, YOUR SEAT NUMBER IS: %d%n", economySeatCount++);
				 System.out.println();
			 }
			 else {
				 System.out.println("THERE ARE NO MORE SEATS AVAILABLE IN THE ECONOMY SECTION.\n"
					 		+ "IS IT ACCEPTABLE WE BOOK YOU A SEAT IN THE FIRST CLASS SECTION?\n"
					 		+ "IF YES, PRESS 1. IF NO, PRESS 0. ");
					 if (input.nextInt() == 0) {
						 System.out.println("NEXT FLIGHT LEAVES IN 3 HOURS");
						 break;
					 }
			 	}
			 
		 	}
		 
		}
		
		
		
		
	
 }
}
