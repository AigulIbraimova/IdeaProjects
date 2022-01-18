package methods;


public class InputOddNumbers3 {
	
	public static void main(String[] args) {
		inputOddNumbers(10);
	}

	public static void inputOddNumbers(int limit) {
		
		for(int n=0; n<=limit; n++) {
			if(n % 2==1) {
				System.out.print(n + " ");
			}
		}
		
	}
}
