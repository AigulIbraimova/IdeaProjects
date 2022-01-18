package youtube;

import java.util.Scanner;

public class ShortHand {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your current speed");
		
		int currentSpeed = input.nextInt();
		
		if(currentSpeed > 60) {
			
			System.out.println("Slow down");
			
			int difference = currentSpeed - 50;
			currentSpeed -= difference;
		}else {
			System.out.println("Keep driving");
		}
		System.out.println(currentSpeed);
		
		
		
	}

}
