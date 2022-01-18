package stringmanipulation;

public class AccountNumber {
	
	public static void main(String[] args) {
		
		String num = "Your account number: 57376AFHD";

		
		int indexOfFirst = num.indexOf(":")+2;
		System.out.println(indexOfFirst);
		
		char firstDigit = num.charAt(indexOfFirst);
		System.out.println(firstDigit);
		String account;
		
		if(firstDigit =='2') {
			
			account = num.substring(indexOfFirst, indexOfFirst + 6);
			System.out.println(account);
			
		}else {
			account = num.substring(indexOfFirst, indexOfFirst+ 5);
		}
		System.out.println("Account: " + account);
	}

}
