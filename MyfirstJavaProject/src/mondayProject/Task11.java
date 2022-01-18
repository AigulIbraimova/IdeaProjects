package mondayProject;

import java.util.Scanner;

public class Task11 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = input.nextInt();
		input.nextLine();
		String allSquares = "";
		int square = 0;
		if(x > 0) {
			for(int i = 1; 1 <= x; i++) {
				if(i % 2 == 0 && i % 3 ==0) {
					square = i * i;
					allSquares += square + "";
				}
			}
			System.out.println(allSquares);
		}
		else {
			System.out.println("Invalid entry");
		}
	}
   
}
