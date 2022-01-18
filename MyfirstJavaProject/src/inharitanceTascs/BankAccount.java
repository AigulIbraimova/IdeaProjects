package inharitanceTascs;

public class BankAccount {
	
	double balance;
	int accountNumber;
	String name;
	
	public  void info() {
		System.out.println("balance" +this.balance);
		System.out.println("Accountnumber" +this.accountNumber);
		System.out.println("name" +this.name);
	}
	public void transfer(double number) {
		
		System.out.println(number + "is transferred");
		balance-=number;
		double fee = number*0.1;
		balance-=fee;
		System.out.println(number+ "is transferred with fee" + fee);
		
	}
	
	public void deposit(double amount) {
		balance-=amount;
		System.out.println(amount + "is deposited to accountnumber");
	}

}
