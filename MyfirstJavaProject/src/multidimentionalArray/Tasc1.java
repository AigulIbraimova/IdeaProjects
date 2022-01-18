package multidimentionalArray;

import java.util.Arrays;

public class Tasc1 {
	
	public static void main(String[] args) {
	int [][] nums = {{14,22,34,45,25},{55,62,73,85,39},{56,43,23,21,98},{53,11,43,12,35}};
	int maximum = 0;
	for(int [] n: nums) {
		int sum = 0;
		////System.out.println(Arrays.toString(n));
		for(int i: n) {
			sum += i;
			//System.out.print(i +" ");

	}
		if(sum > maximum) {
			maximum = sum;
		}
		//System.out.println();
	
	}
	System.out.println(maximum);
	}
	
}
