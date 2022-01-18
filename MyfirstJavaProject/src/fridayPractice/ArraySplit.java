package fridayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySplit {
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		   
		    //Write your code below
		    // System.out.println("Enter your word");
				String str = input.nextLine();
				
				String [] arr = str.split("@");
				System.out.println(Arrays.toString(arr));
				
				if(arr.length>2 || !str.contains("@")) {
					System.out.println("invalid email");
				}else {
					System.out.println("Email id: " + arr[0]);
					System.out.println("Email domain: " + arr[1]);
				}
		
			
		
	}

}
