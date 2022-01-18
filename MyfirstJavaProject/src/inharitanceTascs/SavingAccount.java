package inharitanceTascs;

public class SavingAccount extends BankAccount{
	
	double interesIncome;
	
	@Override
	public void transfer(double number) {
		balance-=number;
		double fee = number*0.2;
		balance-=fee;
	}
	
	@Override
	public void info() {
		System.out.println("balance" +this.balance);
		System.out.println("Accountnumber" +this.accountNumber);
		System.out.println("name" +this.name);
	}

}
