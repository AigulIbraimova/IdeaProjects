package objectCreations;

public class Bank {
	
	String type;
	int accountNumber;
	double balance;
	String holderName;
	
	public void deposit(double amount) {
		System.out.println(amount + " is deposited to your account!");
		balance += amount;
	}
	
	public void transfer(double amount) {
		System.out.println(amount + " is transferred from your account!");
		balance -= amount;
	}
     
	public void info() {
		System.out.println("\nYour Bank Information");
		System.out.println("Type: " + type);
		System.out.println("Holder name: " + holderName);
		System.out.println("Balance: " + balance);
		System.out.println("Account Number: " + accountNumber);
	}
}
