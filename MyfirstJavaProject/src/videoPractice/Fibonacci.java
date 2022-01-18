 package videoPractice;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		//0,1,1,2,3,5.....
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = input.nextInt();
		int count=0;
		for(int i=0, j=1; ; i+=j, j+=i) {
			System.out.println(i+ " ");
			count++;
			if(j>num) {
				System.out.println("\nRemainder is " + (num-i));
				break;
			}
			System.out.println(j+ " ");
			count++;
			if(i+j>num) {
				System.out.println("\nRemainder is: " + (num - j));
				break;
			}
		}
		System.out.println("It took " + count + " steps.");
	}

}
