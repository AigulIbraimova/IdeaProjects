package youtube;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		for (int i=2; i<number; i++) {
			if(number % i == 0) {
				System.out.println("not prime");
				break;
			}
			
				System.out.println("prime");
			
		}
		
	}

}
