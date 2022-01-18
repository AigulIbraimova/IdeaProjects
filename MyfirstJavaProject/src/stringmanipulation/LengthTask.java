package stringmanipulation;

public class LengthTask {
	
	public static void main(String[] args) {
		
		String num = "Account Number: 45345362";
		
		int firstIndex = num.indexOf(":") + 2;
		
		String accountNumber = num.substring(firstIndex);
		
		if(accountNumber.length() == 8) {
			
			System.out.println("Valid account number length");
			
		}else {
			System.out.println("Invalid account number length");
		}
		
		
		
	}

}
