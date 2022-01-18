package fridayPractice;

import java.util.Scanner;

public class PrimeNumberReplit {
	
	public static void main (String [] args) {
		
		Scanner input =new Scanner(System.in);
		int num = input.nextInt();
		boolean b = true;
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
			
			System.out.println(num+ " is not prime number!");
			break;
		}
		
		}
		if(!b) {
		
				System.out.println(num+ " is  prime number!");
				
		}		
	}

}
