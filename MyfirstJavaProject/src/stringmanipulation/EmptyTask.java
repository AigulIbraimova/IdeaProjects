package stringmanipulation;

import java.util.Scanner;

public class EmptyTask {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Whats is your name?");
		
		String name = input.nextLine().trim();
		
		if(name.isEmpty()){
			
			System.out.println("Enter valid name");
			
		}else {
			System.out.println("Invalid name");
		}
		
		
		
	}

}
