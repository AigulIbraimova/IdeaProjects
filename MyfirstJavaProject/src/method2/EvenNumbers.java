package method2;

import java.util.Arrays;

public class EvenNumbers {
	public static void main(String[] args) {
		int numbers [] = {1,3,4,5,6,7,8,9,13,34,23};
		System.out.println(Arrays.toString(numbers));
		System.out.println(returnEvenNum(numbers));
		
		
	}
	
	public static int returnEvenNum(int [] arr) {
		int count = 0;
		for(int i:arr) {
			if(i % 2==0) {
				count++;
			}
		}
		return count;
	}

}
