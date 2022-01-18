package startsWith;

public class SundayTask2 {
	
	public static void main(String[] args) {
		
        String num = "Account number: 24657457ACCD";
		
		boolean checkAccount = num.startsWith("2", 16);
		if(checkAccount) {
			
	    System.out.println("Cool");
	    
		}else {
			System.out.println("Not cool");
		}
		
		
		
	}

}
