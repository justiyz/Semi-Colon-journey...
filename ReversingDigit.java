
public class ReversingDigit {

	public static void main(String[] args) {
		
		int number = 556778;
		int temporaryNumber = number;
		int result = 0;
		
		while (temporaryNumber > 0) {
			int remainder = temporaryNumber % 10;
			result = result * 10 + remainder;
			temporaryNumber = temporaryNumber / 10;
		}
		
		System.out.printf("The reverse of the digit is: %d%n", result);

	}

}
