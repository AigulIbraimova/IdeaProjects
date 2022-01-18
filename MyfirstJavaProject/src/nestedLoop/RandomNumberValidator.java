package nestedLoop;

import java.util.Random;

public class RandomNumberValidator {
	
	public static void main(String[] args) {
		
		Random input =new Random();
		int target = input.nextInt(100);
		int attempts = 0;
		for(int i =0; i <100; i++) {
			attempts++;
			if(i == target) {
				System.out.println("Number is found");
				System.out.println("Number of attempts:" +attempts);
				System.out.println("Target:" +target);
				break;
			}
			
		}
		
		
	}

}
