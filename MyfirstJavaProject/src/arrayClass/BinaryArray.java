package arrayClass;

import java.util.Arrays;

public class BinaryArray {
	
	public static void main(String[] args) {
		
		int numbers [] = {45,23,6,-3,66};
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == 66) {
		   //if(numbers[i] == -3){	
		     System.out.println(i);	
		     break;
			}
		}
		Arrays.parallelSort(numbers);
		 System.out.println(Arrays.toString(numbers));
		 int result = Arrays.binarySearch(numbers, 23);
		 System.out.println(result);	
		
		 //int result = Array.binarySearch(numbers, 77);
		 //-5-(-1)-->-6
		 //output: -6
		 
		 
		 
	}

}
