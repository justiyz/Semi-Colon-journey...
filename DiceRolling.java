import java.security.SecureRandom;
public class DiceRolling {

	public static void main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		
		int [] counter = new int [11];
		int [] doubleDieCount = {2,3,4,5,6,7,8,9,10,11,12};
		int sum = 0;
		int count = 2;

		
		for (int roll = 1; roll <= 36000; roll++) {
			int firstDie = 1 + randomNumbers.nextInt(6);
			 int secondDie = 1 + randomNumbers.nextInt(6);
			
//			System.out.printf("%d %5d%n", firstDie, secondDie);
			sum = firstDie + secondDie;
//			System.out.println("The sum is:"+  sum);
			
			for(int i = 0; i < doubleDieCount.length; i++ ) {
				if (sum == doubleDieCount[i]) {
					counter[i]++;
					
					
				}
			}
				
		}
		System.out.printf("%s %20s%n", "Number", "Number Of Times");

		
		for(int num : counter) {
			System.out.printf("%4d %16d%n",count++, num );
			
		}
				
		
		
	

		

		
	}

}
