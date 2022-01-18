package project1;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		double number1,number2,result;
		String operator;
		
		System.out.println("Please enter two double values:");
		
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		System.out.println("Please choose operator below:\n*,/,+,-");
		operator = input.next();
		switch(operator){
		case "+":
		result = number1 + number2;
		break;
		case "-":
		result =number1 - number2;
		break;
		case "/":
		result = number1 / number2;
		break;
		case "*":
		result = number1 * number2;
		break;
		
		default:
		System.out.println("It is not operator");
		
		
		
		
		
		}
		
		
		
		
	}

}
