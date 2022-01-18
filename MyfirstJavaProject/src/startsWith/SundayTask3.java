package startsWith;

import java.util.Scanner;

public class SundayTask3 {
	
	public static void main(String[] args) {
		
//		String message = "Hello";
//		String luna = message.replace("e","o");
//		System.out.println(luna);
//		
		
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter message");
	String message = input.nextLine();
//        
//        message = message.replace("hate","love -");
//        System.out.println(message);
        

        message = message.replace("u","");
        
        message = message.replace("U","");
        System.out.println(message);

	}

}
