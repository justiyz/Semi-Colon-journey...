import java.util.Scanner;
public class SalesCommisionCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double sum = 0;
		double salesPersonEarnings = 0;
		
		System.out.println("Enter items sold or -1 to exit : ");
		double itemSold = input.nextDouble();
		
		while (itemSold != -1) {
			System.out.println("Enter items sold or -1 to quit");
			
			sum += itemSold;
			salesPersonEarnings =   sum * 0.09 + 200;
			System.out.printf("The sum of items in naira is %.2f%n", sum);
			
			 itemSold = input.nextDouble();
		}
		
		System.out.printf("The sales person earnings in naira %.2f%n", salesPersonEarnings);
		
		
		
		
		

	}

}
