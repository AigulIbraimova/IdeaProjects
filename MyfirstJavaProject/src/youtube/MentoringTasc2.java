package youtube;

import java.util.Arrays;
import java.util.Scanner;

public class MentoringTasc2 {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please, provide the size of the array:");
		int size = kbd.nextInt();
		
		int [] nums = new int [size];
		System.out.println("Please, fill your array with numbers: ");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = kbd.nextInt();
		}
		
		System.out.println(maxDiff(nums));
		System.out.println(minDiff(nums));
		
	}
	
	public static int maxDiff(int [] arr) {
		Arrays.sort(arr);
		
		return arr[arr.length - 1] - arr[0];
	}
	
	public static int minDiff(int [] arr) {
		
		Arrays.sort(arr);
		
		int diff = Integer.MAX_VALUE; 
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i+1] - arr[i] < diff) {
				diff = arr[i+1] - arr[i];
			}
		}
		return diff;
		
	}
	}


