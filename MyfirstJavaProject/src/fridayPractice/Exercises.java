package fridayPractice;

import java.util.Scanner;

public class Exercises {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two words");
		String luna = input.nextLine();
		String star = input.nextLine();
		
		//System.out.println(luna+luna2);
		
		int moon = luna.length();
		System.out.println("length:" +moon);
		
		char last = luna.charAt(moon-1);
		System.out.println("last:" + last);
		
		char first = star.charAt(0);
		System.out.println("firs:" +first);
		
		if(last == first) {
			System.out.println(luna + star.substring(1));
			
		}else {
			System.out.println(luna + star);
		}
				
		
		
		
				
		
		
	}

}
