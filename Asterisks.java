
public class Asterisks {

	public static void main(String[] args) {

		
/*		for(int position = 1; position <=10; position++) {
			for (int step =1; step <= position; step++) {
				System.out.print("*");
			}
			System.out.println();
		}*/


		
/*		for (int position = 10; position>0; position--) {
			for (int step=1; step < position; step++) {
				System.out.print("*");
		}
		
			System.out.println();
		}
		*/
		
		

		for (int position = 0; position <= 4; position++) {
			for(int step = 0; step <= 4; step++) {
				if (step <= position) {
					System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}	
		
	
			
			
			
			
			
/*		for (int position=1; position<=30; position++) {
			for (int step=1; step<=position; step++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		
		
				
/*		int numOfRows = 29;
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
		*/
		
					
		
		
		
		
/*		for (int i=8; i>0; i--) {
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
				}
			
				System.out.println();
			
			}
			*/
		
			
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
