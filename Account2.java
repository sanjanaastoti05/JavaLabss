package Inheritance;

public class Account2 
{
	protected String accHolder;
	public float balance;
	
	public Account2(String accHolder, float balance) {
		this.accHolder = accHolder;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
        System.out.println("Deposited: " + amount);
		
	}
	
	public void displayBalance() {
        System.out.println("Current Balance: " + balance);

	}
	
	public boolean  withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn " + amount);
			return true;
		}
		else
		{
			System.out.println("Insufficient balance ");
			return false;
		}
	}
		
	

}



