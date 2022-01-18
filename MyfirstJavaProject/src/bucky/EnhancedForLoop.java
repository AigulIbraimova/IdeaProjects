package bucky;

public class EnhancedForLoop {
	
	public static void main(String[] args) {
		
		int nums [] = {32,31,5,3};
		
		int total = 0;
		
		for(int x:nums) {
			
			total+=x;
		}
		System.out.println(total);
		
		
	}

}
