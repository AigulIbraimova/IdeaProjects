package project1;

import java.util.Scanner;

public class Cumpus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
			System.out.println("Welcome to Club");
			int age = input.nextInt();
			if(age >=20) {
			
		}
		else {
			System.out.println("Not enough age!");
			int difference =20 - age;
			System.out.println("Please come back after " + difference + " years");
		}
	}
}
	

	