package loops;

import java.util.Scanner;

public class TaskLoop {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int attempts = 0;
		
		for(; ;) {
			System.out.println("Enter password");
			String password =input.next();
			attempts++;
		if(password.equals("secret478")) {
				System.out.println("Wellcome");
				break;
			}
		if(attempts == 3) {
			System.out.println("Sorry your account is locked. Try after 5 hours");
			break;
		}
		
		
			
		}	
	}

}
