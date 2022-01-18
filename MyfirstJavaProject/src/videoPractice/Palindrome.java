package videoPractice;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("civick"));
		
	}
	
	public static boolean isPalindrome(String check) {
		String reversed = "";
		for(int i=check.length()-1; i>=0; i--) {
			reversed=reversed+check.charAt(i);
		}
		if(check.equals(reversed)) {
			return true;
		}else {
			return false;
		}
		
	}

}
