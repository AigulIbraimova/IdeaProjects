package videoPractice;

public class StringManipulation {
	
	public static void main(String[] args) {
		String str1 = "Cybertek";
		String str2 = "Avangers";
		str2 = str2.toLowerCase();
		for(int i = 0; i < str2.length(); i++) {
			char a = str2.charAt(i);
			
			if(str2.indexOf(a) == str2.lastIndexOf(a)) {
				System.out.print(a);
			}
			
		}		
}
}
