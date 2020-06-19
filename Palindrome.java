import java.util.Scanner;
public class Palindrome {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 0;
		int result = 0;
		System.out.println("Enter your palindrome: ");
		num = input.nextInt();
		
		while(num == 5) {
//			System.out.println("Enter your palindrome: ");
//			num = input.nextInt();
			result = num % 1000;
			
		}
	   System.out.println(result);
	   
	}
}

