package bucky;

public class SumElementsOfArray {
	
	public static void main(String[] args) {
		
		int ages [] = {32,31,5,3};
		int sum = 0;
		for(int i=0; i<ages.length; i++) {
			sum+=ages[i];
		}
		System.out.println("Sum of this numbers is " + sum);
		
	}

}
