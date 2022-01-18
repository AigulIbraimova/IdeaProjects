package fridayPractice;

import java.util.Scanner;

public class Palindrome {
	
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		
		String star = input.nextLine();
		String luna ="";
		
		for(int i = star.length()-1; i>=0; i-- ) {
		luna+=star.charAt(i);	
		}
		System.out.println(luna);
		
		if(star.equalsIgnoreCase(luna)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
		
	}

}
