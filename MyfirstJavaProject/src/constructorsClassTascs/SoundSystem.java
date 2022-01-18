package constructorsClassTascs;

import java.util.Scanner;

public class SoundSystem {
	
	public static void main(String[] args) {
		
//		Speaker s1 = new Speaker("");
//		Speaker s2 = new Speaker("");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter model:");
		String m = input.nextLine();
		System.out.println("Please enter color: ");
		String c = input.nextLine();
		Phone p1 = new Phone(m,c);
		System.out.println("Please enter phone number to call:");
		long pn = input.nextLong();
		p1.call(pn);
		
		
	}

}
