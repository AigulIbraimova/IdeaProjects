package fridayPractice;

import java.util.Scanner;

public class FrydayTask {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println(" Enter symbols");
		String symbol =input.nextLine();
		
		System.out.println("Enter word");
		String word =input.nextLine();
		
		String first =symbol.substring(0,symbol.length()/2);
		System.out.println("First part of symbols" +first);
		
		String second =symbol.substring(2);
		System.out.println("second part of symbols" +second);
		
		System.out.println(first +word +second);
		
		
		
		
		
		
	}

}
