package youtube;

import java.util.*;

public class ArrayPractice {
	public static void main(String[] args) {
//		
//		String names [] = {"Aigul","Jasmin","Aylin"};
//		for(int i=0; i<names.length; i++) {
//		System.out.println("Name " + names[i]);	
//		}
		
//		String names [] = {"Jasmin","Aylin"};
//		for(String item:names) {
//			System.out.println("Name " + item);
//		}
		
//		int nums [] = {1,2};
//		for(int num:nums) {
//			System.out.println("Namber " + num);
//		}
		
//		int numbers [] = {4,2,7};
//		Arrays.sort(numbers);
//		for(int item:numbers) {
//			System.out.println(Arrays.toString(numbers));
//			break;
//		}
//		String names [] = {"aigul","jasmin","aylin"};
//		Arrays.sort(names);
//		for(String item:names) {
//			
//			System.out.println(item);
//		}
		int nums [] = {2,5,7,14};
		System.out.println(Arrays.binarySearch(nums, 2));
		System.out.println(Arrays.binarySearch(nums, 5));
		System.out.println(Arrays.binarySearch(nums, 6));
		System.out.println(Arrays.binarySearch(nums, 122));
	}

}
