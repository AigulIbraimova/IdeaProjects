package ifelsestatements;

import java.util.Scanner;

public class Credentials {
	public static void main(String[] args) {
		
		String username = "test";
		String password ="test123";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter username:");
		String enteredUsername = input.nextLine();
		
		System.out.println("Please enter password:");
		String enteredPassword = input.nextLine();
		
		if(enteredUsername.contentEquals(username) && enteredPassword.contentEquals(password)) {
			System.out.println("Welcome," + enteredUsername +"!!!");
			
		}
		else if(!enteredUsername.contentEquals(username) && enteredPassword.equals(password)) {
			System.out.println("Envalid password");
		}
		
		else if(!enteredUsername.equals(username) && enteredPassword.contentEquals(password))
			
		System.out.println("Envalid Credentials");
	}

}
