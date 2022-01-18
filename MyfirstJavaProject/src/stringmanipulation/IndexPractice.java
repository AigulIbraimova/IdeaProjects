package stringmanipulation;

import java.util.Scanner;

public class IndexPractice {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the message to send");
		
		String message = input.nextLine().toLowerCase().trim();
		
		int first = message.indexOf("heck");
		int second = message.indexOf("silly");
		int third = message.indexOf("idiot");
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		System.out.println(first + "," + second + "," + third);
		
		if(first == -1 && second == -1 && third == -1) {
			
			System.out.println("Message sent!");
			
		}else {
			System.out.println("Message failed!luna");
			
		}
		
				
		
		
	}

}
