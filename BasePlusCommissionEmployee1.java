
public class BasePlusCommissionEmployee1 extends CommissionEmployee{

	private double baseSalary;
	
	public BasePlusCommissionEmployee1(String firstName, String lastName,
			 String socialSecurityNumber, double grossSales,
			 double commissionRate, double baseSalary) {
		
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if (baseSalary < 0.0)
			 throw new IllegalArgumentException(
			 "Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary (double baseSalary) {
		if (baseSalary < 0.0)
			 throw new IllegalArgumentException(
			 "Base salary must be >= 0.0");
		this.baseSalary = baseSalary;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	
	@Override
	public double earnings() {
		return baseSalary + (commissionRate * grossSales);
	}
	
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
				"base-salaried commission employee", firstName, lastName,
				"social security number", socialSecurityNumber,
				"gross sales", grossSales, "commission rate", commissionRate, 
				"base salary", baseSalary);
	}
	
	
/*THIS IS A SUBCLASS THATS EXTENDS THE CommissionEmployee CLASS... THIS IS JUST TO VALIDATE THE 
 FACT THAT SAYS YOU CAN'T ACCESS A SUPER CLASS VARIABLE THAT HAS "PRIVATE" ACCESS MODIFIER 
 DIRECTLY FROM A SUBCLASS (THATS WHY THE VARIABLE CALL IN THE "earnings" AND "toString" METHOD
  ARE INDICATING ERROR). 
  WE EITHER CHANGE THE ACCESS MODIFIER IN THE SUPERCLASS TO "PROTECTED" OR WE ACCESS THE
   VARIABLE THROUGH A METHOD CALL IN THE SUPERCLASS. 
   BUT FOR GOOD SOFTWARE ENGINEERING PRACTICE, WE USE "PRIVATE" ACCESS MODIFIER IN THE SUPER 
   CLASS AND ACCESS THAT VARABLE THROUGH A METHOD IN THE SAME SUPERCLASS*/
}
