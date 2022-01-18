package tasksInClass;
//import java.util.*;
import java.util.Scanner;

import java.util.Random;


public class NumberGuessGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int secretNumber = random.nextInt(10); //4
		
		System.out.println("Please guess one number between 0 and 10");
		int enteredNumber = input.nextInt(); //8
		
		if(enteredNumber > secretNumber) {
			System.out.println("Your guess is too high");
		}
		else if(enteredNumber < secretNumber) {
			System.out.println("Your guess is too low");
		}
		else {
			System.out.println("Congratulations! You got it!");
		}
			System.out.println("Secret number was:" +secretNumber);	
			
		}
			
}


