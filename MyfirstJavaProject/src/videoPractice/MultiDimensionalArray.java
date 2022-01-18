package videoPractice;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		int [][] data = {{12,5,4},{23,113,32}};
		
		for(int [] rows:data) {
			System.out.println("Row: ");
			for(int column:rows) {
				System.out.println(column + " ");
			}
			System.out.println();
		}
	}

}
