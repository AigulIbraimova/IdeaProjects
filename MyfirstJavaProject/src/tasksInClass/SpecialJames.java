package tasksInClass;

import java.util.Scanner;

public class SpecialJames {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String firstName;
		String lastName;
		
		System.out.println("What is your name?");
		
		firstName = input.nextLine();
		if(firstName.equals("James")) 
		   
		{
			System.out.println("What is your last name?");
			lastName = input.nextLine();
		}else {
			lastName = "Nobody";
		}
		System.out.println("First name:" + firstName);
		System.out.println(("Last name:" + lastName));
	}

}
