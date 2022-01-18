package wednesdayTascs;

public class Tasc6MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		int [][] nums = {{14,22,34,45,25},{55,62,73,85,39},{56,43,23,21,98},{53,11,43,12,35}};
		
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		
		rowAndCol(nums, 2,2);
		
	}
	public static void rowAndCol(int [][] arr, int row, int column) {
		
		System.out.println("The element at the row: " +row + ", column: " + column  + " element: "+  arr[row][column]); 
		
	}

}
