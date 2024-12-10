package programs;

public class Bank {

	public static void main(String[] args) {
		 
		BankAccount acct1=new BankAccount("Jackson", 10000);
		BankAccount acct2=new BankAccount("Emily", 5000);
		BankAccount acct3=new BankAccount("Richard", 15000);
	

	 System.out.println("Initial Bank Accounts:");
	 System.out.println(acct1);
	 System.out.println(acct2);
	 System.out.println(acct3);
	 
	 acct1.deposit(5000);
	 acct2.withdraw(2000);
	 acct3.deposit(1000);
	 System.out.println();
	 System.out.println("Final Bank Accounts :");
	 System.out.println(acct1);
	 System.out.println(acct2);
	 System.out.println(acct3);
	 
	}
}

