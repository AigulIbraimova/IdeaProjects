package methods;

public class ReverseStringTasc4 {
	
	public static void main(String[] args) {
		reverseString("School");
		reverseString("Camera");
		reverseString("Computer");
	}
	
	public static void reverseString(String word) {
		String result = "";
		for(int i =word.length()-1; i>=0; i--) {
			result += word.charAt(i);
			
		}
		System.out.println(result);
	}

	
	
}
