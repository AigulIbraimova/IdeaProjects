package inharitanceTascs;

public class CheckingAccount extends BankAccount{
	
	@Override
	public void transfer(double number) {
		balance-=number;
		double fee = number*0.05;
		balance-=fee;
		
	}
	
	

}
