package Inheritance;

public class CurrentAccount extends Account2 
{
	private double overdraftLimit;
	

	public CurrentAccount(String accHolder, float balance, double overdraftLimit)
	{
		super(accHolder, balance);
		this.overdraftLimit = overdraftLimit;
		
	}

	@Override
    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn from Current: " + amount);
            return true;
        } else {
            System.out.println("Overdraft limit exceeded. Cannot withdraw.");
            return false;
        }
    }
	

}
