package arrayClass;

import java.util.Arrays;

public class TwoMaxNumbersArrayTasc2 {
	
	public static void main(String[] args) {
		
		int num [] = {23,1,34,3,54,54,51};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		
		int last = num.length-1;
		System.out.println(num[last]);
		
		for(int i =last; i>=0; i--) {
			if(num[last] != num[i]) {
				System.out.println(num[i]);
			break;
		}
		
		
	}
	
	}

}
