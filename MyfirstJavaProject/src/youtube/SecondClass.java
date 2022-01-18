package youtube;

import java.util.Scanner;

public class SecondClass {
	
	public static void main(String[] args) {
		
//		FirstClass classObject = new FirstClass();
//		classObject.simpleMessage();
		
		Scanner input = new Scanner(System.in);
		FirstClass classObject = new FirstClass();
		System.out.println("Enter your name");
		String name = input.nextLine();
		classObject.simpleMessage(name);
		
		
	}

}
