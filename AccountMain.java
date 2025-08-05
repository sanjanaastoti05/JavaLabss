package Inheritance;

public class AccountMain 
{

    private static int accCounter = 1000;
    private int accNum;
    private Person accHolder;
    private double balance;

    public AccountMain(Person accHolder, double balance) {
        if (balance < 500) {
            throw new IllegalArgumentException("Minimum balance must be INR 500");
        }
        this.accHolder = accHolder;
        this.balance = balance;
        this.accNum = ++accCounter;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal denied: Minimum balance of INR 500 must be maintained.");
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accNum + "\n" +
               "Account Holder: " + accHolder + "\n" +
               "Balance: INR " + balance;
    }

    public static void main(String[] args) {
        Person smith = new Person("Smith", 30f);
        Person kathy = new Person("Kathy", 25f);

        AccountMain smithAccount = new AccountMain(smith, 2000);
        AccountMain kathyAccount = new AccountMain(kathy, 3000);

        smithAccount.deposit(2000);
        kathyAccount.withdraw(2000);

        System.out.println("Smith's Account Details: " + smithAccount);
        System.out.println("-----------");
        System.out.println("Kathy's Account Details: " + kathyAccount);
    }
}
