package methods;

public class StringAndInt {
	
	public static void main(String[] args) {
		String name = "Lawrence1";
		//Scanner input = newScanner(System.in);
		//System.out.println("Enter your name");
		//String name= input.nextLine();
		checkLength(name, 8);
		
	}

	public static void checkLength(String word, int number) {
		if(word.length() == number) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
	}
}
