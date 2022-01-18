package stringmanipulation;

public class StringPalindrome {
	public static void main(String[] args) {
		String s = "civic";
		
		String empty = "";
		for(int i = s.length()-1; i >= 0; i--) {
			empty = empty + s.charAt(i);
		}
		
		// empty = ketrebyc
		System.out.println(empty);
		
		if(s.equals(empty)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
