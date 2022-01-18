package objectCreations;

import java.util.Scanner;

public class MyHouse {
	
	public static void main(String[] args) {
		
		House h1 = new House();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter type of the house: ");
		h1.type = input.nextLine();
		System.out.println("Please enter address: ");
		h1.address = input.nextLine();
		System.out.println("Please enter number of roooms: ");
		h1.numRooms = input.nextInt();
		
		h1.info();
		
	}

}

