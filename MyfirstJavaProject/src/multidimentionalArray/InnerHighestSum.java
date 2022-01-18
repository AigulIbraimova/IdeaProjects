package multidimentionalArray;

import java.util.Arrays;

public class InnerHighestSum {

	public static void main(String[] args) {
		int[][] numbers = { { 4, 2, 6, 45, 23, 1 }, { 22, 34, 66 }, { 1, 2, 3 } };
		getHighestSum(numbers);

	}

	public static void getHighestSum(int[][] nums) {
		int maxSum = 0; // Integer.MIN_VALUE;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = 0; j < nums[i].length; j++) {
				sum += nums[i][j];
			}
			if (sum > maxSum) {
				maxSum = sum;
				index = i;

			}
		}
		System.out.println(Arrays.toString(nums[index]));

	}

}
