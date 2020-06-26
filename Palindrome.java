import java.util.Scanner;
public class Palindrome {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		while(true) {
			int num = input.nextInt();
			int tempNum = num;
			int result = 0;
			
			if  (num > 10000 && num < 100000 ) {
				 
				while(tempNum > 0) {
					int remainder = tempNum % 10;
					result = result * 10 + remainder;
					tempNum = tempNum / 10;	
				}
			
				if (num == result) {
					System.out.println("The number you entered is a palindrome ");
				}
				else
					System.out.println("The number you entered is not a palindrome !!!");
				break;
			 }
			 else {
				 System.out.println("Please enter a five digit number \n");
			
			}
				
		}
	   
	}
}

