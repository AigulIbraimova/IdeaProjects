package method2;

import java.util.Arrays;
import java.util.Random;

public class RandomTasc {
	
	public static void main(String[] args) {
		
		int numbers [] =getArray(5, 100);
		System.out.println(Arrays.toString(numbers));
	}
	public static int [] getArray(int size, int bound) {
		int [] nums = new int[size];
		Random rand = new Random();
		for(int i=0; i< nums.length; i++) {
			nums[i] = rand.nextInt(bound);
		}
		return nums;
	}

}
