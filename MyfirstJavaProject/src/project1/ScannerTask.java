package project1;

import java.util.Scanner;

public class ScannerTask {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age =input.nextInt();
		
		if(age <= 21) 
		{			
			System.out.println("Welcome to school club:");							
		}
		else {
			System.out.println("good bye");
		}
		
		
		
		
		
	}

}
