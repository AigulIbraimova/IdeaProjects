package wednesdayTascs;

import java.util.Arrays;
import java.util.Scanner;

public class Tasc5 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to DIVIDE MY ARRAY");
		System.out.println("Enter a number that will be the size of your array");
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int numbers [] = new int[size];
		
		System.out.println("Enter numbers for your array" );
		for(int i=0; i<numbers.length; i++) {
			numbers[i]= scan.nextInt();
		}
		
		int [] firstHalf = Arrays.copyOfRange(numbers, 0, numbers.length/2);
		int [] secondHalf = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);
	
		
		System.out.println("The string value of your array is: " + Arrays.toString(numbers));
		System.out.println("The first half of your array is: " + Arrays.toString(firstHalf));
		System.out.println("The second half your array is: " +Arrays.toString(secondHalf));
	
		
		
	}

}
