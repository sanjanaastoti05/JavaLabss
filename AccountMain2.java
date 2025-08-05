package Inheritance;

public class AccountMain2 {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("Smitha", 1000);
		sa.displayBalance();
		sa.withdraw(600);
		sa.withdraw(400);
		sa.displayBalance();
		
		System.out.println("--------");
		
		CurrentAccount ca = new CurrentAccount("Ram",2000,1000);
		ca.displayBalance();
		ca.withdraw(2500);
		ca.withdraw(700);
		ca.displayBalance();
		
		
		
	}

}
