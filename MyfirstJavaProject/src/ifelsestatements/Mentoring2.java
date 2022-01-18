package ifelsestatements;

import java.util.Scanner;

public class Mentoring2 {
	public static void main (String[] args) {
		Scanner input =new Scanner(System.in);

		int x;
		int y;
		x = input.nextInt();
		y = input.nextInt();
		int remainder = x / y;
		if (remainder == 0) {
			System.out.println("It is divisible");
		}else {
			System.out.println("It is not divisible");
		}
	}
	

}
