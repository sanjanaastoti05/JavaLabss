package Inheritance;

public class SavingsAccount extends Account2
{
	private static final double min_bal =500.0;
	public SavingsAccount(String accHolder, float balance)
	{
		super(accHolder, balance);
		
	}
	@Override
    public boolean withdraw(double amount) {
        if (balance - amount >= min_bal) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
            return true;
        } else {
            System.out.println("Cannot withdraw. Minimum balance of " + min_bal + " must be maintained.");
            return false;
        }
    }
}
