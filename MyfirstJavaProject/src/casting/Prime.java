package casting;

import java.util.Scanner;

public class Prime {
	
	public static void main(String[] args) {
		
//		String s = "Published on Feb 12, 1993";
//		
//		int indexOfComma = s.indexOf(",");
//		
//		s = s.substring(indexOfComma + 2);
//		
//		System.out.println(s);
//		
//		int year = Integer.valueOf(s);
//		
//		if(year <= 2019) {
//			System.out.println("Valid year");
//			
//		}else {
//			System.out.println("Invalid year");
//		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your message");
		
		String message = input.nextLine();
		char firstChar = message.charAt(0);
		
		int decimalValue = firstChar;
		
		
		System.out.println(decimalValue);
		 
		if(decimalValue >= 65 && decimalValue <= 90 &&(message.endsWith(".") || message.endsWith("!"))) {
			System.out.println("Valid message");
		}else {
			System.out.println("Invalid message");
		}
		
		
		
	}

}
