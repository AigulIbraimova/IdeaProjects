package fridayPractice;

import java.util.Scanner;

public class ExercisesTask {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word");
		
		String tuna = input.nextLine();
		boolean isodd = tuna.length()%2 == 1;
		
		System.out.println("isodd:" +isodd);
		
		
	}

}
