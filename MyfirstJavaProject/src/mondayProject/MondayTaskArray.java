package mondayProject;

import java.util.Arrays;
import java.util.Scanner;

public class MondayTaskArray {
	
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);

		int [] size  = new int [5];
		for(int a=0; a<5; a++) {
			size [a] = input.nextInt();
		}
		System.out.println(Arrays.toString(size));
		
		
		
		
		
	}

}
