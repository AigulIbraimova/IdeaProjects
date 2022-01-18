package stringmanipulation;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name = input.next();
		//name = name.toLowerCase();
		
		char first= name.charAt(0);
		
		int i  = name.length()	;	
		//System.out.println(c);
		
		char last =  name.charAt(i - 1);
		
		if(first == 'a' && last == 'l') {
			
			System.out.println("Cool");
			
		}else {
			
			System.out.println("Not very cool");
		}
		
		
		
				
		
		

		
		
		
	}

}
