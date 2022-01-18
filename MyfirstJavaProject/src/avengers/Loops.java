package avengers;

public class Loops {
	
	public static void main(String[] args) {
		
		String name = "Traver";
		String box = "";
		
		for(int i=0; i<name.length(); i++) {
		box += name.charAt(i) + "-";
		
		
		
		}
		
		System.out.println(box.substring(0,box.length()-1));
		
		
		
	}

}
