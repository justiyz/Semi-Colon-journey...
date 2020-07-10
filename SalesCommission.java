import java.util.Scanner;
public class SalesCommission {

	public static void main(String[] args) {
		int [] counter = new int [9];
		int basicSalary = 200;
		double commission = 0.09;
		double weeklySalary = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Gross Sales: ");
		
			int [] grossSales = new int [9];
			
			for (int i=0; i<grossSales.length; i++) {
				grossSales[i] = input.nextInt();
				weeklySalary = grossSales[i] * commission + basicSalary;
			
				if (weeklySalary >= 200 && weeklySalary <=299) {
					counter[0]++;
				}
				else if (weeklySalary >= 300 && weeklySalary <=399) {
						counter[1]++;
				}
				else if (weeklySalary >= 400 && weeklySalary <=499) {
						counter[2]++;
				}
				else if (weeklySalary >= 500 && weeklySalary <=599) {
						counter[3]++;
				}
				else if (weeklySalary >= 600 && weeklySalary <=699) {
						counter[4]++;
				}
				else if (weeklySalary >= 700 && weeklySalary <=799) {
						counter[5]++;
				}
				else if (weeklySalary >= 800 && weeklySalary <=899) {
						counter[6]++;
				}
				else if (weeklySalary >= 900 && weeklySalary <=999) {
						counter[7]++;
				}
				else  {
				counter[8]++;
												}	
				System.out.printf("The salary of Sales Person %d is %.2f%n", i, weeklySalary);
				System.out.println();
				System.out.println();
			
			
			}
			System.out.println("Range" +"               "+ "Frequency");
			System.out.println("200-299"+"                  "+counter[0]);
			System.out.println("300-399"+"                  "+counter[1]);
			System.out.println("400-499"+"                  "+counter[2]);
			System.out.println("500-599"+"                  "+counter[3]);
			System.out.println("600-699"+"                  "+counter[4]);
			System.out.println("700-799"+"                  "+counter[5]);
			System.out.println("800-899"+"                  "+counter[6]);
			System.out.println("900-999"+"                  "+counter[7]);
			System.out.println("1000 & above"+"             "+counter[8]);
	}
						
}
	
		 
	
	
	
	
	
	
	
	
	
	
		 
			  
			  
		  
		 	  

	
	

