package startsWith;

public class SundayTask {
	
	public static void main(String[] args) {
		
		String weather = "Really good";
		
		boolean check = weather.startsWith("Really");
		
		System.out.println(check);
		
		boolean check2 = weather.endsWith("d");
		
		System.out.println(check2);
		
		boolean check3 = weather.startsWith("ly" ,4);
		
		System.out.println(check3);
				
		
	}

}
