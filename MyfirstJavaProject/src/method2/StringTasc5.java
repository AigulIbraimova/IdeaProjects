package method2;

public class StringTasc5 {
	
	public static void main(String[] args) {
		String w = "contains";
		System.out.println(removeCon(w));
		
		
	}
	
	public static String removeCon(String word) {
		word = word.toLowerCase().trim();
		if(word.contains(" ") || word.length() < 3) {
			System.out.println("Invalid data");
			return "";
		}
		if(word.contains("con")) {
			String s = word.replace("con", "");
			return s;
		}else {
			return word;
		}
	}

}
