package youtube;

import java.util.Arrays;

public class MentoringTasc3 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,4,6,4,3,5,3,42,23,3,6,1};
		System.out.println(Arrays.toString(bubleSort(arr)));
		
	}
	
	public static int[] bubleSort(int[] arr) {
		int countSwaps = 0;
		boolean swapped = true;
		while(swapped) {
			swapped = false;
		}
		for(int i=0; i<arr.length-1-countSwaps; i++) {
			countSwaps = 0;
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
				swapped = true;	
			
			}
		}
		
		countSwaps++;
	
	return arr;
}
}

