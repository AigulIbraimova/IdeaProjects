package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of cars you have");
		
		int  numberOfCars = input.nextInt();
		
		String [] myGarage = new String[numberOfCars];
		
		System.out.println(Arrays.toString(myGarage));
		
		for(int i =0; i <numberOfCars; i++) {
			
			myGarage[i] = "Aston Martin";
		}
	
		System.out.println(Arrays.toString(myGarage));
		
		  myGarage [0] = "BMW";
		  myGarage [numberOfCars-1] = "Mercedes";
		  System.out.println(Arrays.toString(myGarage));
		
		
	}

}
