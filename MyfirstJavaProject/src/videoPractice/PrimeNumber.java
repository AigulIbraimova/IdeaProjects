package videoPractice;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		displayPrimeNumber(20);
		
		
		
	}
	
	public static void displayPrimeNumber(int num) {
		// 0 - 20
		for(int i=0; i<=num; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
    
	 public static boolean isPrime(int num) {
	        
	        if(num<2) {
	            return false;
	        }
	        for(int i=2; i<num; i++) {
	            if(num%i==0) {
	                return false;
	            }
	        }
	        
	        return true;
	    }
}
