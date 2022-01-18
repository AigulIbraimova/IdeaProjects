package stringmanipulation;

public class StrPalindrome {
	public static void main(String[] args) {
		
		String word = "Civic";
		String box = "";
		for(int i=word.length()-1; i>=0; i--) {
			box+=word.charAt(i);
		}
		System.out.println(box);
		
		if(word.equalsIgnoreCase(box)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
	}

}
