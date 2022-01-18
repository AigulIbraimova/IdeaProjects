package method2;

public class RemoveLetters {
	public static void main(String[] args) {
		String w = "concert";
		System.out.println(remove3Letters(w, "nce" ));
		
		
	}
    public static String remove3Letters(String word, String letters) {
    	word = word.toLowerCase().trim();
    	if(word.contains(" ") || word.length() < 3) {
    		System.out.println("Invalid data");
    		return "";
    	}
    	if(word.contains(letters)) {
			return word.replace(letters, "");
		}else {
			return word;
	
	
		}
}
}