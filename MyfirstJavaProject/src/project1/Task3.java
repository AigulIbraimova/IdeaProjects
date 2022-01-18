package project1;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1, number2, number3;
		
		System.out.println("Please enter three integers");
		
		number1 = input.nextInt();
		number2 = input.nextInt();
		number3 = input.nextInt();
		
		if (number1 == number2 && number1 == number3) {
			System.out.println("All numbers are equal");
			
	   }else if (number1 >= number2 && number1 >= number3) {
		   System.out.println("Max number:" +number1);
		   
	   }else if (number2>= number1 && number2 >= number3){
		   System.out.println("Max number:" +number2);
	   }else if (number3 >= number1 && number3 >+number2) {
	   
	   }else {
		   System.out.println("They are all equal");
	   }
		
	
	}

}
