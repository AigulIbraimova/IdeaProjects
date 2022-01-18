package method2;

public class SplitTasc3 {
	
	public static void main(String[] args) {
		String result = "About 8,770,000 results (0.51 seconds)";
		String count =resultCount(result);
		System.out.println(count);
		
		
		
		String c = resultCount("About 2,330,000,000 results (0,86 seconds)");
		System.out.println(c);
	}

	public static String resultCount(String res) {
		
		String words [] = res.split(" ");
		String s =words[1];
		s = s.replace(",", "");
		
		return s;
		
		
	}
	
}
