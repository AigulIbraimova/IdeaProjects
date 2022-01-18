package youtube;

import java.util.Arrays;

public class VoidArrayPractice {
	public static void main(String[] args) {
		int [] arr = {19,49,35,75,90,2,34};
		getMax(arr);
//		getMax(new int [] {});
//		int arr [] = new int [] {};
//		getMax(arr);
		
	}
	
	public static void getMax(int [] nums) {
		if(nums.length == 0) {
			System.out.println("ERROR Array is empty");
			return;
		}
		Arrays.sort(nums);
		
		System.out.println(nums[nums.length-1]);
	}

}
