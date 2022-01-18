package multidimentionalArray;
import java.util.*;
public class OuterInnerArrayTasc {
	
	public static void main(String[] args) {
		int [][] n = getMultiArray (2,5);
		System.out.println(Arrays.deepToString(n));
		
	}
	public static int [][] getMultiArray(int size1, int size2){
		int[][]numbers = new int[size1][size2];
		Random r = new Random();
		for(int i =0; i < numbers.length; i++) {
			for(int j =0; j < numbers[i].length; j++) {
				numbers[i][j] = r.nextInt(200);
				
			}
		}
		return numbers;

	}
	

}
