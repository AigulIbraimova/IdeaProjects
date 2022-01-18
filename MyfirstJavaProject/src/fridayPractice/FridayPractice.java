package fridayPractice;

import java.util.Scanner;

public class FridayPractice {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	System.out.println("Please enter your numbers");
//		String message = input.nextLine();
//		
////		String luna = "Java exercises";
////		int star = luna.length();
////		System.out.println("length:" + star);
////		System.out.println(luna.charAt(0));
////		
////		char firstCh = luna.charAt(0);
////		System.out.println("First char:" +firstCh);
////		
////		char tensCh = luna.charAt(10);
////		System.out.println(luna.charAt(10));
////		System.out.println("10 is:" + tensCh);
////		
//		
//		int star = message.length();
//		char second = message.charAt(1);
//		System.out.println("second is:" +second);
//		
//		
		                       int a =input.nextInt();
		                       int b =input.nextInt();
		                       int c =input.nextInt();
		
		                       if(a> b && a>c) {
			                          System.out.println(a +" is greatest");
		                       }else if(b>a && b>c) {
			                          System.out.println(b +" is greatest");
		                       }else {
			                          System.out.println(c +" is greatest");
		                           }
			
		                       
		                       
		                       
		
	}

}
