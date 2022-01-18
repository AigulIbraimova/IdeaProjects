package project1;

import java.util.Scanner;

public class Apples {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		double num1, num2, answer;
		
		System.out.println("Enter your first  number");
		num1 = input.nextDouble();
		
		System.out.println("Enter your second number");
		num2 = input.nextDouble();
		
		answer = num1 + num2;
		System.out.println(answer);
		
		
	}

}
