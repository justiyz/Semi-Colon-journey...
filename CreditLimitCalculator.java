
public class CreditLimitCalculator {
	
	
	int accNumber;
	int beginningBalance ;
	int itemsCharged;
	int creditsApplied;
	int creditLimit;
	
	public CreditLimitCalculator(int accNumber, int beginningBalance,
			int itemsCharged, int creditsApplied, int creditLimit) {
		
		this.accNumber = accNumber;
		this.beginningBalance = beginningBalance;
		this.itemsCharged = itemsCharged;
		this.creditsApplied = creditsApplied;
		this.creditLimit = creditLimit;
		
		}
	
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public void setBeginningBalance(int beginningBalance) {
		this.beginningBalance = beginningBalance;
	}
	public void setItemsCharged(int itemsCharged) {
		this.itemsCharged = itemsCharged;
	}
	public void setCreditApplied(int creditApplied) {
		this.creditsApplied = creditApplied;
	}
	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	public int getAccNumber() {
		return accNumber;
	}
	public int getBeginningBalance() {
		return beginningBalance;
	}
	public int getItemsCharged() {
		return itemsCharged;
	}
	public int getCreditsApplied() {
		return creditsApplied;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	
	
	public int getNewBalance() {
		int newBalance = beginningBalance + itemsCharged - creditsApplied;
		if(newBalance > creditLimit ) {
			System.out.println("Credit Limit Exceeded!!!");
		
		}
		else {
			System.out.println("Credit Limit Not Exceeded!!!");
		}
		return newBalance;
	}
	
	
	
	
	

	public static void main(String[] args) {
		CreditLimitCalculator limit = new CreditLimitCalculator(4,4,4,4,9);
		System.out.println( limit.getNewBalance());
		
		
	}
}
