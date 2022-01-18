package videoPractice;

import java.util.Random;

public class RandomVoidMethodTasc {
	
	public static void main(String[] args) {
		playGuessNum();
	}
	
	public static void playGuessNum() {
		
		Random rand = new Random();
		int secretNumber = rand.nextInt(3);
		
		do {
			System.out.println("Guess the secret number:");
			int guessNumber = rand.nextInt(3);
			System.out.println("Guessing: " +guessNumber);
			if(guessNumber == secretNumber) {
				System.out.println("You won!");
				break;
			}else {
				System.out.println("Wrong Try again");
			}
			
		
			
		}while (true);
	}

}
