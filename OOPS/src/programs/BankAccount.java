package programs;

public class BankAccount {
	
	private String ownersname;
	private int accountNumber;
	private double accountBalance;
	private static int accountcount;
	
	

	public BankAccount(String ownersname) {
		super();
		this.ownersname = ownersname;
		this.accountBalance = 0.0;
		accountNumber = accountcount  +1;
		accountcount++;
		
	}

	public BankAccount(String ownersname, double accountBalance) {
		super();
		this.ownersname = ownersname;
		this.accountBalance = accountBalance;
		accountNumber = accountcount + 1;
		accountcount++;
	}
	
	public String getOwnersname() {
		return ownersname;
	}

	public void setOwnersname(String ownersname) {
		this.ownersname = ownersname;
	}

	public double getAccountcount() {
		return accountcount;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
		
	public void deposit(double amount) {
		this.accountBalance = this.accountBalance + amount;
	}
     
	public void withdraw(double amount) {
		this.accountBalance = this.accountBalance - amount;
		
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return accountNumber + ": " + ownersname + " balance=" + accountBalance;
	
	}
	public static void main(String[] args) {
		

	}

}
