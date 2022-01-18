package methods;

import java.util.Arrays;

public class ArrayReplaceNumber {
	public static void main(String[] args) {
		int [] nums = {23,-1,3,-2,-785,90,};
		//print negativeNums(nums);
		System.out.println(Arrays.toString(nums));
		replaceNegativeNums(nums,100);
		
	}
public static void replaceNegativeNums(int [] nums, int replacement){
   for(int i =0; i<nums.length; i++) {
	if(nums[i]<0) {
		nums[i] =replacement;
	}
}
   System.out.println(Arrays.toString(nums));
}
	
	
	
}
