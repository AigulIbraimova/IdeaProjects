package fridayPractice;

import java.util.Scanner;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		
		System.out.println("Please enter two words");
		String one = input.nextLine();
		
		//System.out.println("Please enter another word");
		String two = input.nextLine();
		//System.out.println(one+two+two+one);
		
		System.out.println(one.concat(two).concat(two).concat(one));
		
//		System.out.print(one);
//		System.out.print(two);
//		System.out.print(two);
//		System.out.print(one);
//		
		
		
		
		
		
		
	}

}
