package whileLoop;

import java.util.Scanner;

public class WhileLoop3 {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int balance =1500;
		int transactionAmount;
		
		while(balance > 0) {
		System.out.println("Enter transaction amount");
		
		transactionAmount = input.nextInt();
		if(transactionAmount > balance) {
			System.out.println("Transaction amount is too high. Try lower price");
			continue;
		}
		balance = balance - transactionAmount;
		
		}
		if(balance == 0) {
		System.out.println("You're broke");
		}
		System.out.println("your balance:" + balance);
	}

}
