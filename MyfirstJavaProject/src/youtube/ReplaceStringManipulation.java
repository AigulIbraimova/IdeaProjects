package youtube;

import java.util.Scanner;

public class ReplaceStringManipulation {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String userIn = input.nextLine().trim().toLowerCase();
		
		userIn = userIn.replace("awake", "*****");
		
		System.out.println(userIn);
	}

}
