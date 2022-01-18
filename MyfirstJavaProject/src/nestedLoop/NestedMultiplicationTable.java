package nestedLoop;

import java.util.Scanner;

public class NestedMultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = input.nextInt();
		
		for(int a =1; a<=10; a++) {
			for(int j=1; j<=10; j++) { 
				
				System.out.println(a + "x" +j + "=" + (a * j) );
			}
			System.out.println("___________");
		}
		
	}

}
