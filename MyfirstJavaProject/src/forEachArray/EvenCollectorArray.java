package forEachArray;

import java.util.Arrays;

public class EvenCollectorArray {
	
	public static void main(String[] args) {
		
//		int nums [] = {1,2,-3,4,-34,55,78,90,33,10};
//		int number = 0;
//		int evens = 0;
//		int odds = 0;
//		for (int num:nums) {
//			number = number + num;
//			if(num % 2 == 0) {
//				evens = evens + num;
//			}else {
//				odds = odds + num;
//			}
//		}
//		System.out.println("numbers " + number);
//		System.out.println("evens " + evens);
//		System.out.println("Odds " +odds);
//		
		  int[]numbers = {1,2,-3,4,-34,55,78,90,33,10};
	        int counter =0;
	        for(int num:numbers) {
	            if(num%2==0) {
	                counter++;
	            }
	    
	        }
	        //Once we find even numbers we are creating array called evens
	        System.out.println(counter);
	        int evens[]=new int[counter];
	        int i=0;
	        //Loop through numbers again and find even number to store them
	        //into array evens
	        for(int num:numbers) {
	            if(num%2==0) {
	                evens[i]=num;
	                i++;
	            }
	        }
	        System.out.println(Arrays.toString(evens));
	}

}
