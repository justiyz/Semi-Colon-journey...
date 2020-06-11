
public class StarAstersiks {

	public static void main(String[] args) {
		
		 int row = 9;
		 int star = 1;
		 int space = row / 2;
		 int midPoint = row / 2 + 1;
		 
		 for (int i = 1; i <= row; i++) {
			 for (int j = 1; j <= space; j++) {
				 System.out.print(" ");
			 }
			 for (int k = 1; k <= star; k++) {
				 System.out.print("*");
			 }
			 System.out.println();
			 if (i < midPoint) {
				 star +=2;
				 space--;
			 }
			 else {
				 star -=2;
				 space++;
			 }
		 }

	}

}
//Just  a self test
