package ifelsestatements;

import java.util.Scanner;

public class Mentoring {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int x;
//write a fragment of code that will change the integer value stored in x as follow:		
//if x is even, divide x by 2. if x is a odd,multiply by 3 and subtract 1	
		
		x =input.nextInt();
		int remainder =x %2;
		if (remainder == 0)
		{
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
	}
	

}
