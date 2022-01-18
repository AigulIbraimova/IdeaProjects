package forEachArray;

import java.util.Arrays;

public class ForLoopArrayTask1 {
	
	public static void main(String[] args) {
		
     int [] numbers = {1,2,3,4,5,6,7,8,9};
		
		for(int number:numbers) {
			System.out.print(number + " ");
	 }
     //Double the even value, triple the odd values
		for (int i = 0; i < numbers.length; i++ ) {
			if(numbers[i] % 2 == 2) {
				numbers[i] = numbers[i] * 2;
			}else {
				numbers[i] = numbers[i] * 3;
			}
		}
		System.out.println();
      //Print values with space separated
	  //System.out.println(Arrays.toString(numbers));
		for( int number:numbers) {
			System.out.print(number + " ");
		}
}
}