package youtube;

import java.util.*;

public class ScannerTasc {
	
	public static void main(String[] args) {
//		Random rand = new Random();
//		int number = rand.nextInt(100)+1;
//		System.out.println(number);
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		int age = input.nextInt();
		input.nextLine();
		System.out.println("Whats is your name?");
		String name= input.nextLine();
		System.out.printf("Hello %s, age %d\n", name,age);
				
		
		
	}

}
