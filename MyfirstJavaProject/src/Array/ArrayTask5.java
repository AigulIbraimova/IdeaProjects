package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask5 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of cars you have:");
		int numOfCars = input.nextInt();
		input.nextLine();
		String [] myGarage = new String[numOfCars];
		System.out.println(Arrays.toString(myGarage));
		
		for(int i = 0; i < numOfCars; i++) {
			System.out.println("Please enter car " + (i+1) + ":");
			String carName = input.nextLine();
			myGarage[i] = carName;
		}
		System.out.println(Arrays.toString(myGarage));
		
	}
		
	}


