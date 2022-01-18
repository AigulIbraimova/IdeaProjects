package loops;

import java.util.Scanner;

public class MyLoop2 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
//		for(int a =1; a <=5; a++) {
//			System.out.println("Please enter name" +a);
//			String name =input.nextLine();
//			System.out.println(name);
//					
//		}
//		
//		for( ; ; ) {
//		String message =input.nextLine();
//		if(message.equals("hi")) {
//			System.out.println("hello");
//		}else {
//			System.out.println("Good bye");
//		}
//		
//		}	
		for(int a =0; a<50; a++) {
			System.out.println("Hello");
			if(a ==12)
			break;
		}
	}

}
