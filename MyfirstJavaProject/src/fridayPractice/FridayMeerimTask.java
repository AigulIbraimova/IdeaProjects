package fridayPractice;

import java.util.Scanner;

public class FridayMeerimTask {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter first word ");
		String first =input.nextLine();
		
		System.out.println("Enter second word");
		String second =input.nextLine();
		
		if(first.length() > second.length()) {
			System.out.println(second +first +second);
		}else if(first.length() <second.length()) {
			System.out.println(first +second +first);
		}
		
		
		
	}

}
