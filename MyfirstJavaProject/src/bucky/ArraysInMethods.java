package bucky;

public class ArraysInMethods {
	
	public static void main(String[] args) {
		
		int numbers [] = {32,31,5,3};
		change(numbers);
		
		for(int y:numbers) {
			System.out.println(y);
		}
		
		
	}
	
	public static void change(int x []) {
		for(int i=0; i<x.length; i++) {
			x[i]+=5;
			
		}
	}

}
