
public class ReversingDigit {

	public static void main(String[] args) {
		
		int number = 121;
		int temporaryNumber = number;
		int result = 0;
		
		while (temporaryNumber > 0) {
			int remainder = temporaryNumber % 10;
			result = result * 10 + remainder;
			temporaryNumber = temporaryNumber / 10;
		}
		
		System.out.println(result);

	}

}
