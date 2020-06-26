
public class PrimeNumbers {
	
	
	int num = 7;	
	int counter = 0;
	
	public void Prime() {
		for (int i=2; i<num; i++) {
			if (num%i==0) {
				counter++;
			break;
			}
		}
		
		if (counter==0)
			System.out.println("This is a prime number");
		else
		System.out.println("This is not a prime number");	
		}
	
	
	public void checkPrime() {
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		PrimeNumbers prime=  new PrimeNumbers();
		
		prime.Prime();
		

	}

}
