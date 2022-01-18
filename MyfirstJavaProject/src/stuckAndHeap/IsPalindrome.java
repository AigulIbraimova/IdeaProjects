package stuckAndHeap;

public class IsPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("hello"));
		System.out.println(isPalindrome("civic"));
//		System.out.println(removeCon("apple"));
//		System.out.println(removeCon("convert"));
//		System.out.println(removeCon("apple"));
		System.out.println(removeCon("School", "ch"));
	}

	public static String removeCon(String word, String target) {
		word = word.toLowerCase();
		if (word.length() < target.length()) {
			System.out.println("Invalid data");
			return "";
		} else if (word.trim().contains(" ")) {
			System.out.println("Invalid data");
			return "";
		} else if (!word.contains(target.toLowerCase())) {
			return word;
		} else {
			StringBuilder sb = new StringBuilder(word);
			sb.delete(sb.indexOf(target.toLowerCase()), sb.indexOf(target.toLowerCase()) + target.length());
			return sb.toString();
		}
	}

	public static boolean isPalindrome(String word) {
		StringBuilder sb = new StringBuilder(word);
		String reversed = sb.reverse().toString();
		if (reversed.contentEquals(word)) {
			return true;
		} else {
			return false;
		}

	}

}
