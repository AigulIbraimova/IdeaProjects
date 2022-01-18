package videoPractice;
import java.util.*;
public class BinarySearchArray {
	
	public static void main(String[] args) {
		int [] nums = {2,4,7,6,9,5};
		System.out.println(Arrays.binarySearch(nums,2));
		System.out.println(Arrays.binarySearch(nums,4));
		System.out.println(Arrays.binarySearch(nums,7));
		System.out.println(Arrays.binarySearch(nums,16));
		System.out.println(Arrays.binarySearch(nums,19));
		System.out.println(Arrays.binarySearch(nums,5));
		
	}

}
