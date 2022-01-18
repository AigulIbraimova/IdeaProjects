package bucky;

public class MultiDimensionalArray {
	
	public static void main (String [] args) {
		
		int firstArr [][] = {{5,5,5,5},{4,4,4,4}};
		int secondArr [][] = {{3,3,3,3},{2},{1,1,1}};
		
		System.out.println("This is the first array");
		display(firstArr);
		System.out.println("This is the second array");
		display(secondArr);
		
	}
		public static void display(int x [][]) {
			for(int row=0; row<x.length; row++) {
				for(int column=0; column<x[row].length; column++) {
					System.out.print(x[row][column] + "\t");
				}
				System.out.println();
			}
		}
		
	

}
