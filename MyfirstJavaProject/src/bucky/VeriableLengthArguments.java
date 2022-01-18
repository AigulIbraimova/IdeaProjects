package bucky;

public class VeriableLengthArguments {
	
	public static void main(String[] args) {
		
		System.out.println(average(9,15,3,4,5,6,7,8,9));
		
	}
	
	public static int average(int...numbers) {
		int total=0;
		for(int x:numbers) {
			total+=x;
			
		}
		return total/numbers.length;
	}

}
