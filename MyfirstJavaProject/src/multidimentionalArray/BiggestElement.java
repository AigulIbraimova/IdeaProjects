package multidimentionalArray;

public class BiggestElement {
	
	public static void main(String[] args) {
		int [][] elements = {{4,2,6,45,23,1},{22,34,66},{1,2,3}};
		getBiggestElement(elements);
	}
	
	public static void getBiggestElement(int [][] nums ) {
		int biggest = nums[0][0];
		for(int i=0; i<nums.length; i++) {
			for(int j =0; j<nums[i].length; j++) {
				if(nums[i][j]>biggest) {
					biggest = nums[i][j];
				}
			}
		}
		System.out.println("biggest: " +biggest);
	}
	
	

}
