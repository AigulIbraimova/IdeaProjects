package objectCreations;

public class BankAccount$ {
	
	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		
		b1.accountNumber = 1234567;
		b1.balance = 16.500;
		b1.holderName = "James Bond";
		b1.type = "checking";
		b1.info();
		b1.deposit(2000000);
		b1.info();
		b1.transfer(100000);
		b1.info();
		
		
		
		
		
		
	}

}
