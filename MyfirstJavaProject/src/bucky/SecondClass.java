package bucky;

import java.util.Scanner;

public class SecondClass {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FirstClass lunaObject = new FirstClass();
	    System.out.println("Enter your first girlfriend's name:");
	    String girln = input.nextLine();
		lunaObject.setName(girln);
		lunaObject.saying();
		
		
	}

}
