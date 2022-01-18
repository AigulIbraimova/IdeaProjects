package project1;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		int number1,number2;
		
		System.out.println("Please enter two integers:");
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		if(number1>number2) {
			System.out.println("Max number " +number1);
		}
		else {
			System.out.println("Max number " +number2);
			
		}
		
		
		
		
		
	}
}
	
		


	
