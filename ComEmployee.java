
public class ComEmployee extends Employee {
	private double grossSales;
	private double commissionRate;

	public ComEmployee(String firstName, String lastName, String socialSecurityNumber,
			double grossSales, double commissionRate) {
		
		super(firstName, lastName, socialSecurityNumber);
		  
		if (grossSales < 0.0)
			throw new IllegalArgumentException("gross sales must be > 0.0");
		if (commissionRate <= 0.0 || commissionRate >=1)
			throw new IllegalArgumentException("commision rate must be > 0.0 and < 1.0");
		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0)
			throw new IllegalArgumentException("gross sales must be > 0.0");
		this.grossSales = grossSales;
	}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >=1)
			throw new IllegalArgumentException("commision rate must be > 0.0 and < 1.0");
		this.grossSales = commissionRate;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	
	@Override
	public double earnings() {
		return getGrossSales() * getCommissionRate();
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", "commission employee",
				super.toString(), "gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
	
	
	
	

}
